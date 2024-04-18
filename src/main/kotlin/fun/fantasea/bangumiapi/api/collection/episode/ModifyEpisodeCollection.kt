package `fun`.fantasea.bangumiapi.api.collection.episode

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.dto.ModifyEpisodeCollectionDTO
import `fun`.fantasea.bangumiapi.util.APPLICATION_JSON
import `fun`.fantasea.bangumiapi.util.BASE_URL
import `fun`.fantasea.bangumiapi.util.toJsonString
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

/**
 * todo test
 */
class ModifyEpisodeCollection(
    private val subjectId: String,
    private val body: ModifyEpisodeCollectionDTO,
) : Api<Unit> {
    override val path: String
        get() = "/v0/users/-/collections/$subjectId/episodes"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .patch(
                body
                    .toJsonString()
                    .toRequestBody(APPLICATION_JSON)
            )
            .build()
    }
}
