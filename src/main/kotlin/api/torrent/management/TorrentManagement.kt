package api.torrent.management

interface TorrentManagement {
    suspend fun getTorrentList(): List<TorrentInfo>
}