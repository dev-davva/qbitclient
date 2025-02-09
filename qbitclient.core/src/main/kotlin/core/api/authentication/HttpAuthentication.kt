package core.api.authentication

import core.http.HttpClient

class HttpAuthentication(private val httpClient: HttpClient) :
    Authentication {
    private val resourceUrl = "api/v2/auth"

    override suspend fun login(username: String, password: String) {
        val body = "username=$username&password=$password"
        httpClient.post("$resourceUrl/login", body, "application/x-www-form-urlencoded")
    }
}