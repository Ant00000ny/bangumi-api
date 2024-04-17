package `fun`.fantasea.bangumiapi.api.character

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.PersonDetail
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetPerson(
    private val personId: Int,
) : Api<PersonDetail> {
    override val path: String
        get() = "/v0/persons/$personId"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .get()
            .build()
    }
}
