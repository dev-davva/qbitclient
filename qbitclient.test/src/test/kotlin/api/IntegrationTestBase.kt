package api

import QBitClientFactory
import core.QBitClient
import io.github.cdimascio.dotenv.Dotenv
import kotlinx.coroutines.runBlocking
import kotlin.test.BeforeTest

abstract class IntegrationTestBase {
    lateinit var client: QBitClient

    @BeforeTest
    fun setup() {
        val dotenv = Dotenv.load()
        client = QBitClientFactory.createClient(dotenv["BASE_URL"])
        val username = dotenv["USERNAME"]
        val password = dotenv["PASSWORD"]
        runBlocking {
            client.authentication.login(username, password)
        }
    }
}