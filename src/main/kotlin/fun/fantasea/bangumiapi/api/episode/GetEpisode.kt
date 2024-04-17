package `fun`.fantasea.bangumiapi.api.episode

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.respentity.EpisodeDetail
import `fun`.fantasea.bangumiapi.util.BASE_URL
import okhttp3.Request

class GetEpisode(
    private val episodeId: Int,
) : Api<EpisodeDetail> {
    override val path: String
        get() = "/v0/episodes/$episodeId"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .get()
            .build()
    }
}
