package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.SubjectRelation
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetSubjectRelations(
    private val subjectId: Int,
) : Api<List<SubjectRelation>> {
    override val path: String
        get() = "/v0/subjects/$subjectId/subjects"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .get()
            .build()
    }
}
