package core.json

import java.lang.reflect.Field

abstract class JsonSerializer {
    fun getJsonPropertyName(field: Field): String {
        val annotation = field.getAnnotation(JsonProperty::class.java)
        return annotation?.name ?: field.name
    }
    abstract fun serialize(obj: Any): String
    abstract fun <T> deserialize(json: String, type: Class<T>): T
}