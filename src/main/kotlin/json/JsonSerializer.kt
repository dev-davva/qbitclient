package json

interface JsonSerializer {
    fun serialize(obj: Any): String
    fun <T> deserialize(json: String, type: Class<T>): T
}