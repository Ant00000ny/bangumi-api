package `fun`.fantasea.nano.bangumiapi.api

import `fun`.fantasea.nano.bangumiapi.entity.respentity.ApiResponseEntity
import `fun`.fantasea.nano.bangumiapi.exception.BangumiApiException
import `fun`.fantasea.nano.bangumiapi.util.bangumiOkhttpClient
import `fun`.fantasea.nano.bangumiapi.util.convertTo

/**
 * Bangumi API client, or the api executor.
 */
class BangumiClient(
    val token: String? = null,
) {
    inline fun <reified R : ApiResponseEntity> execute(api: Api<R>): R {
        val request = api.getRequest()
        if (token != null) {
            request.newBuilder()
                .addHeader("Authorization", "Bearer $token")
                .build()
        }

        try {
            return bangumiOkhttpClient.newCall(request)
                .execute()
                .body
                .use { it.string().convertTo<R>() }
        } catch (e: Exception) {
            throw BangumiApiException("bangumi-api request error", e)
        }
    }
}
