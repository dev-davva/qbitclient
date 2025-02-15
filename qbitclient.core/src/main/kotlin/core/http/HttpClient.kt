package core.http

abstract class HttpClient(val baseUrl: String) {

    abstract fun isAuthenticated(): Boolean
    suspend abstract fun get(url: String): String
    suspend abstract fun post(url: String, body: String, mediaType: String = "application/json"): String

}