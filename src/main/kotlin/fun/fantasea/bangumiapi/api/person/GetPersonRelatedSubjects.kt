package `fun`.fantasea.bangumiapi.api.person

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.RelatedSubject
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetPersonRelatedSubjects(
    private val personId: Int,
) : Api<List<RelatedSubject>> {
    override val path: String
        get() = "/v0/persons/$personId/subjects"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .get()
            .build()
    }
}
