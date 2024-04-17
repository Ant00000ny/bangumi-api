package `fun`.fantasea.bangumiapi.api

import okhttp3.Request

/**
 * Bangumi open API.
 */
interface Api<R> {
    val path: String
    fun getRequest(): Request
}
