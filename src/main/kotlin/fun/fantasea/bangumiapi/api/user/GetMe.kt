package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.Me
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetMe(
    private val accessToken: String,
) : Api<Me> {
    override val path: String
        get() = "/v0/me"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .build()
    }
}
