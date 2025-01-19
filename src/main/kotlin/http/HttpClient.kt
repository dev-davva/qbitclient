package http

interface HttpClient {

    suspend fun post(url: String, body: String) : Sequence<String>

}