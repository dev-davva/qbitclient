package core

interface QBitClient {

    fun isAuthenticated(): Boolean
    suspend fun connect(username: String, password: String)

}