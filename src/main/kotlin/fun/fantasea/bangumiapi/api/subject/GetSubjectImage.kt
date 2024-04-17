package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.Type
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Request

class GetSubjectImage(
    private val subjectId: Int,
    private val type: Type,
) : Api<ByteArray> {
    override val path: String
        get() = "/v0/subjects/$subjectId/image"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(
                (BASE_URL + path)
                    .toHttpUrl()
                    .newBuilder()
                    .addQueryParameter("type", type.value)
                    .build()
            )
            .get()
            .build()
    }
}
