package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.RelatedPerson
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetSubjectPersons(
    private val subjectId: Int,
) : Api<List<RelatedPerson>> {
    override val path: String
        get() = "/v0/subjects/$subjectId/persons"

    override fun getRequest(): Request {
        return Request.Builder()
            .get()
            .url(BASE_URL + path)
            .build()
    }
}
