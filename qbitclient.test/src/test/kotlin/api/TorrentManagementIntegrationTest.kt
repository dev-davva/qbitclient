package api

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class TorrentManagementIntegrationTest : IntegrationTestBase() {

    @Test
    fun testTorrents() {
        runBlocking {
            val torrents = client.torrentManagement.getTorrentList()
            assert(torrents.isEmpty())
        }
    }

}