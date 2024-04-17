package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.User
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetUserByName(
    private val username: String,
) : Api<User> {
    override val path: String
        get() = "/v0/users/$username"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .build()
    }
}
