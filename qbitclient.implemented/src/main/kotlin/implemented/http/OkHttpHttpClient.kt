package implemented.http

import core.http.HttpClient
import core.http.HttpException
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

class OkHttpHttpClient : HttpClient  {
    private val client = OkHttpClient()

    override suspend fun get(url: String): Sequence<String> {
        val request = Request.Builder()
            .url(url)
            .build()

        val response = client.newCall(request).execute()

        if (!response.isSuccessful) {
            throw HttpException(response.code, response.message)
        }

        return response.body?.source()?.buffer?.readUtf8()?.lineSequence() ?: emptySequence()
    }

    override suspend fun post(url: String, body: String): Sequence<String> {
        val request = Request.Builder()
            .url(url)
            .post(body.toRequestBody("application/json".toMediaType()))
            .build()

        val response = client.newCall(request).execute()

        if (!response.isSuccessful) {
            throw HttpException(response.code, response.message)
        }

        return response.body?.source()?.buffer?.readUtf8()?.lineSequence() ?: emptySequence()
    }
}