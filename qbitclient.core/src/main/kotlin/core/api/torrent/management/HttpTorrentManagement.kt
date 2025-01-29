package core.api.torrent.management

import core.http.HttpClient
import core.json.JsonSerializer

class HttpTorrentManagement(private val httpClient: HttpClient, private val jsonSerializer: JsonSerializer) :
    TorrentManagement {
    private val resourceUrl = "core/api/v2/torrents"

    override suspend fun getTorrentList(): List<TorrentInfo> {
        return httpClient
            .get("$resourceUrl/info")
            .map { jsonSerializer.deserialize(it, TorrentInfo::class.java) }
            .toList()
    }
}