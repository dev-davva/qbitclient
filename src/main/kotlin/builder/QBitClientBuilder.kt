package builder

import QBitClient
import api.authentication.HttpAuthentication
import http.HttpClient
import json.JsonSerializer

class QBitClientBuilder() {

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

        val authentication = HttpAuthentication(httpClient, jsonSerializer)

        return QBitClientImpl(authentication)
    }

}