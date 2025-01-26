package core.builder

import core.QBitClient
import core.api.authentication.Authentication

internal class QBitClientImpl(private val authentication: Authentication) :
    QBitClient {
    override suspend fun connect(username: String, password: String) {
        authentication.login(username, password)
    }

}