package core

interface QBitClient {

    suspend fun connect(username: String, password: String)

}