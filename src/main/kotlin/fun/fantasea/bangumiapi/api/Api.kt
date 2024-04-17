package `fun`.fantasea.bangumiapi.api

import `fun`.fantasea.bangumiapi.entity.respentity.ApiResponseEntity
import okhttp3.Request

/**
 * Bangumi open API.
 */
interface Api<R : ApiResponseEntity> {
    val path: String
    fun getRequest(): Request
}
