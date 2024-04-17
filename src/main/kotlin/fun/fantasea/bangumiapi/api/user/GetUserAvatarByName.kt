package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.Type
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetUserAvatarByName(
    private val username: String,
    private val type: Type,
) : Api<ByteArray> {
    override val path: String
        get() = "/v0/users/$username/avatar?type=$type"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .build()
    }
}
