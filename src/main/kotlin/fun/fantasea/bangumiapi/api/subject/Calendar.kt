package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.Calendar
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class Calendar : Api<List<Calendar>> {
    override val path: String
        get() = "/calendar"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .get()
            .build()
    }
}
