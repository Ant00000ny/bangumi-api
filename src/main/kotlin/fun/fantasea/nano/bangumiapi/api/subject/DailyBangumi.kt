package `fun`.fantasea.nano.bangumiapi.api.subject

import `fun`.fantasea.nano.bangumiapi.api.Api
import `fun`.fantasea.nano.bangumiapi.entity.respentity.DailyBangumiCollection
import `fun`.fantasea.nano.bangumiapi.util.baseUrl
import okhttp3.Request

class DailyBangumi : Api<DailyBangumiCollection> {
    override val path: String
        get() = "/calendar"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(baseUrl + path)
            .get()
            .build()
    }
}
