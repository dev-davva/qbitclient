package core

import core.api.authentication.Authentication
import core.api.torrent.management.TorrentManagement

interface QBitClient {

    fun isAuthenticated(): Boolean

    val authentication: Authentication
    val torrentManagement: TorrentManagement

}