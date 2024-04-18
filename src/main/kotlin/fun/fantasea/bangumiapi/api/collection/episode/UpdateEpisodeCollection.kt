package `fun`.fantasea.bangumiapi.api.collection.episode

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.dto.UpdateEpisodeCollectionDTO
import `fun`.fantasea.bangumiapi.util.APPLICATION_JSON
import `fun`.fantasea.bangumiapi.util.BASE_URL
import `fun`.fantasea.bangumiapi.util.toJsonString
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

/**
 * todo test
 */
class UpdateEpisodeCollection(
    private val episodeId: String,
    private val body: UpdateEpisodeCollectionDTO,
) : Api<Unit> {
    override val path: String
        get() = "/v0/users/-/collections/-/episodes/$episodeId"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .put(
                body
                    .toJsonString()
                    .toRequestBody(APPLICATION_JSON)
            )
            .build()
    }
}
