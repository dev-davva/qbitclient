package http

interface HttpClient {

    suspend fun get(url: String): Sequence<String>
    suspend fun post(url: String, body: String): Sequence<String>

}