package core.builder

import core.QBitClient
import core.api.authentication.HttpAuthentication
import core.http.HttpClient
import core.json.JsonSerializer

class QBitClientBuilder {

    private lateinit var httpClient: HttpClient
    private lateinit var jsonSerializer: JsonSerializer

    fun withHttpClient(httpClient: HttpClient): QBitClientBuilder {
        this.httpClient = httpClient
        return this
    }

    fun withJsonSerializer(jsonSerializer: JsonSerializer): QBitClientBuilder {
        this.jsonSerializer = jsonSerializer
        return this
    }

    fun build(): QBitClient {
        if (!::httpClient.isInitialized) {
            throw IllegalStateException("HttpClient is required")
        }

        if (!::jsonSerializer.isInitialized) {
            throw IllegalStateException("JsonSerializer is required")
        }

        val authentication = HttpAuthentication(httpClient)

        return object : QBitClient {
            override fun isAuthenticated(): Boolean {
                return httpClient.isAuthenticated()
            }

            override suspend fun connect(username: String, password: String) {
                authentication.login(username, password)
            }
        }
    }

}