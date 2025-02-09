package api

import QBitClientFactory
import core.QBitClient
import io.github.cdimascio.dotenv.Dotenv
import kotlinx.coroutines.runBlocking
import kotlin.test.BeforeTest
import kotlin.test.Test

class AuthenticationIntegrationTest {

    lateinit var client: QBitClient
    lateinit var username: String
    lateinit var password: String

    @BeforeTest
    fun setup() {
        val dotenv = Dotenv.load()
        client = QBitClientFactory.createClient(dotenv["BASE_URL"])
        username = dotenv["USERNAME"]
        password = dotenv["PASSWORD"]
    }

    @Test
    fun testConnect() {
        runBlocking {
            client.connect(username, password)
            assert(client.isAuthenticated())
        }
    }


}