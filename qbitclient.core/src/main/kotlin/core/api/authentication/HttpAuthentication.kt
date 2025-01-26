package core.api.authentication

import core.http.HttpClient
import core.json.JsonSerializer

class HttpAuthentication(private val httpClient: HttpClient, private val jsonSerializer: JsonSerializer) :
    Authentication {
    private val resourceUrl = "core/api/v2/auth"

    override suspend fun login(username: String, password: String) {
        val body = jsonSerializer.serialize(mapOf("username" to username, "password" to password))
        httpClient.post("$resourceUrl/login", body)
    }
}