package `fun`.fantasea.nano.bangumiapi.api.user

import `fun`.fantasea.nano.bangumiapi.api.Api
import `fun`.fantasea.nano.bangumiapi.entity.respentity.Me
import `fun`.fantasea.nano.bangumiapi.util.baseUrl
import okhttp3.Request

class GetMe(
    private val accessToken: String,
) : Api<Me> {
    override val path: String
        get() = "/v0/me"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(baseUrl + path)
            .addHeader("Authorization", "Bearer $accessToken")
            .build()
    }
}
