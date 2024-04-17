package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.SubjectDetail
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetSubject(
    private val subjectId: Int,
) : Api<SubjectDetail> {
    override val path: String
        get() = "/v0/subjects/$subjectId"

    override fun getRequest(): Request {
        return Request.Builder()
            .get()
            .url(BASE_URL + path)
            .build()
    }
}
