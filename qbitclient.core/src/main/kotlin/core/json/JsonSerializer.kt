package core.json

import java.lang.reflect.Field
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaField

abstract class JsonSerializer {
    fun getJsonPropertyName(field: Field): String {
        val kProperty = field.declaringClass.kotlin.memberProperties.find { it.javaField == field }
        val annotation = kProperty?.findAnnotation<JsonProperty>()
        return annotation?.name ?: field.name
    }
    abstract fun serialize(obj: Any): String
    abstract fun <T> deserialize(json: String, type: Class<T>): T
}