import core.QBitClient
import core.builder.QBitClientBuilder
import implemented.http.OkHttpHttpClient
import implemented.json.GsonJsonSerializer

object QBitClientFactory {
    private val clientBuilder = QBitClientBuilder()

    fun createClient(baseUrl: String): QBitClient {
        return clientBuilder
            .withHttpClient(OkHttpHttpClient(baseUrl))
            .withJsonSerializer(GsonJsonSerializer())
            .build()
    }
}