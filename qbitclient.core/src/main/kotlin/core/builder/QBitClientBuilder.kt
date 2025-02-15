package core.builder

import core.QBitClient
import core.api.authentication.Authentication
import core.api.authentication.HttpAuthentication
import core.api.torrent.management.HttpTorrentManagement
import core.api.torrent.management.TorrentInfo
import core.api.torrent.management.TorrentManagement
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

        return object : QBitClient {
            override fun isAuthenticated(): Boolean {
                return httpClient.isAuthenticated()
            }

            override val authentication: Authentication = HttpAuthentication(httpClient)
            override val torrentManagement: TorrentManagement = HttpTorrentManagement(httpClient, jsonSerializer)
        }
    }

}