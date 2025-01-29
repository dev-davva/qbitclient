package implemented.json

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import core.json.JsonSerializer

class GsonJsonSerializer : JsonSerializer() {
    private val gson: Gson = GsonBuilder()
        .setFieldNamingStrategy { f -> getJsonPropertyName(f) }
        .create()

    override fun serialize(obj: Any): String {
        return gson.toJson(obj)
    }

    override fun <T> deserialize(json: String, type: Class<T>): T {
        return gson.fromJson(json, type)
    }
}