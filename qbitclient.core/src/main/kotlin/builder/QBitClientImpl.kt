package builder

import QBitClient
import api.authentication.Authentication

internal class QBitClientImpl(private val authentication: Authentication) :
    QBitClient {
    override suspend fun connect(username: String, password: String) {
        authentication.login(username, password)
    }

}