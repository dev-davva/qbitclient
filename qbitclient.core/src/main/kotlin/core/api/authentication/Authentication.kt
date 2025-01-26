package core.api.authentication

interface Authentication {
    suspend fun login(username: String, password: String)
}