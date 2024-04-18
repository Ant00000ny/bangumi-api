package `fun`.fantasea.bangumiapi.api.collection.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.UserSubject
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetUserSingleCollection(
    private val username: String,
    private val subjectId: Int,
) : Api<UserSubject> {
    override val path: String
        get() = "/v0/users/$username/collections/$subjectId"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .get()
            .build()
    }
}
