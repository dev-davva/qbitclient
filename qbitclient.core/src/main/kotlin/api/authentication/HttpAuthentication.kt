package api.authentication

import http.HttpClient
import json.JsonSerializer

class HttpAuthentication(private val httpClient: HttpClient, private val jsonSerializer: JsonSerializer) :
    Authentication {
    private val resourceUrl = "api/v2/auth"

    override suspend fun login(username: String, password: String) {
        val body = jsonSerializer.serialize(mapOf("username" to username, "password" to password))
        httpClient.post("$resourceUrl/login", body)
    }
}