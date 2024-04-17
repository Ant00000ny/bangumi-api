package `fun`.fantasea.nano.bangumiapi.api.subject

import `fun`.fantasea.nano.bangumiapi.api.Api
import `fun`.fantasea.nano.bangumiapi.entity.respentity.SubjectDetail
import `fun`.fantasea.nano.bangumiapi.util.baseUrl
import okhttp3.Request

class GetSubject(
    private val subjectId: Int,
) : Api<SubjectDetail> {
    override val path: String
        get() = "/v0/subjects/$subjectId"

    override fun getRequest(): Request {
        return Request.Builder()
            .get()
            .url(baseUrl + path)
            .build()
    }
}
