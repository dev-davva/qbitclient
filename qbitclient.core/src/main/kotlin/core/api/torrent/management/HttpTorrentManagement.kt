package core.api.torrent.management

import core.http.HttpClient
import core.json.JsonSerializer

class HttpTorrentManagement(private val httpClient: HttpClient, private val jsonSerializer: JsonSerializer) :
    TorrentManagement {
    private val resourceUrl = "api/v2/torrents"

    override suspend fun getTorrentList(): List<TorrentInfo> {
        return httpClient
            .get("$resourceUrl/info")
            .let {
                if (it.isEmpty()) {
                    return emptyList()
                }
                jsonSerializer
                    .deserialize(it, Array<TorrentInfo>::class.java)
                    .toList()
            }
    }
}