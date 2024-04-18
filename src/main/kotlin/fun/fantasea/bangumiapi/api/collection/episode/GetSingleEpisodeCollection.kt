package `fun`.fantasea.bangumiapi.api.collection.episode

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.UserEpisode
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetSingleEpisodeCollection(
    private val episodeId: Int,
) : Api<UserEpisode> {
    override val path: String
        get() = "/v0/users/-/collections/-/episodes/$episodeId"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .get()
            .build()
    }
}
