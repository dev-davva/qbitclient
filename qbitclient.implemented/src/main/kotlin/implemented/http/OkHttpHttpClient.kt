package implemented.http

import core.http.HttpClient
import core.http.HttpException
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

class OkHttpHttpClient(baseUrl: String) : HttpClient(baseUrl)  {
    private val cookieJar = CookieJarImpl()
    private val client = OkHttpClient.Builder()
        .cookieJar(cookieJar)
        .build()

    private fun buildUrl(url: String): String {
        return baseUrl
            .toHttpUrl()
            .newBuilder()
            .addPathSegments(url)
            .build()
            .toString()
    }

    override fun isAuthenticated(): Boolean {
        return cookieJar
            .loadForRequest(baseUrl.toHttpUrl())
            .any { it.name == "SID" && it.expiresAt > System.currentTimeMillis() }
    }

    override suspend fun get(url: String): Sequence<String> {
        val request = Request.Builder()
            .url(buildUrl(url))
            .build()

        val response = client.newCall(request).execute()

        if (!response.isSuccessful) {
            throw HttpException(response.code, response.message)
        }

        return response.body?.source()?.buffer?.readUtf8()?.lineSequence() ?: emptySequence()
    }

    override suspend fun post(url: String, body: String, mediaType: String): Sequence<String> {
        val request = Request.Builder()
            .url(buildUrl(url))
            .post(body.toRequestBody(mediaType.toMediaType()))
            .build()

        val response = client.newCall(request).execute()

        if (!response.isSuccessful) {
            throw HttpException(response.code, response.message)
        }

        return response.body?.source()?.buffer?.readUtf8()?.lineSequence() ?: emptySequence()
    }
}