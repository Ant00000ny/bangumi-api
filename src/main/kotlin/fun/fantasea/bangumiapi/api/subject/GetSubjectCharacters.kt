package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.RelatedCharacter
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetSubjectCharacters(
    private val subjectId: Int,
) : Api<List<RelatedCharacter>> {
    override val path: String
        get() = "/v0/subjects/$subjectId/characters"

    override fun getRequest(): Request {
        return Request.Builder()
            .get()
            .url(BASE_URL + path)
            .build()
    }
}
