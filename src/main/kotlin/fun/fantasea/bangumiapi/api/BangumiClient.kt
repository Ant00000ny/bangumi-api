package `fun`.fantasea.bangumiapi.api

import `fun`.fantasea.bangumiapi.exception.BangumiApiException
import `fun`.fantasea.bangumiapi.util.convertTo
import `fun`.fantasea.bangumiapi.util.ifThen
import okhttp3.OkHttpClient

/**
 * Bangumi API client, or the api executor.
 */
class BangumiClient(
    private val token: String? = null,
) {
    val bangumiOkhttpClient = OkHttpClient.Builder()
        .followRedirects(true)
        .addInterceptor { chain ->
            val request = chain.request()
                .newBuilder()
                .addHeader("User-Agent", "ant00000ny/bangumi-api")
                .addHeader("Accept", "application/json")
                .ifThen(token != null) { addHeader("Authorization", "Bearer $token") }
                .build()
            chain.proceed(request)
        }
        .build()

    inline fun <T : Api<R>, reified R> execute(api: T): R {
        try {
            val body = bangumiOkhttpClient.newCall(api.getRequest())
                .execute()
                .body
                .use { it.string() }
            return body.convertTo<R>()
        } catch (e: Exception) {
            throw BangumiApiException("bangumi-api request error", e)
        }
    }
}
