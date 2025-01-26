package implemented.json

import core.json.JsonSerializer

class GsonJsonSerializer : JsonSerializer {
    private val gson = com.google.gson.Gson()

    override fun serialize(obj: Any): String {
        return gson.toJson(obj)
    }

    override fun <T> deserialize(json: String, type: Class<T>): T {
        return gson.fromJson(json, type)
    }
}