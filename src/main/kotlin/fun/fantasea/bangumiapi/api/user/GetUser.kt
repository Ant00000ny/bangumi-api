package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.User
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetUser : Api<User> {
    override val path: String
        get() = "/v0/me"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .build()
    }
}
