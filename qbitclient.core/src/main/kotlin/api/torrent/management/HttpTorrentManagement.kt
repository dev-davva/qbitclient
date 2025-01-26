package api.torrent.management

import http.HttpClient
import json.JsonSerializer

class HttpTorrentManagement(private val httpClient: HttpClient, private val jsonSerializer: JsonSerializer) :
    TorrentManagement {
    private val resourceUrl = "api/v2/torrents"

    override suspend fun getTorrentList(): List<TorrentInfo> {
        // https://github.com/qbittorrent/qBittorrent/wiki/WebUI-API-(qBittorrent-4.1)#get-torrent-list
        return httpClient
            .get("$resourceUrl/info")
            .map { jsonSerializer.deserialize(it, TorrentInfo::class.java) }
            .toList()
    }
}