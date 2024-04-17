package `fun`.fantasea.bangumiapi.api.episode

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.EpisodeType
import `fun`.fantasea.bangumiapi.entity.respentity.EpisodeCollection
import `fun`.fantasea.bangumiapi.util.BASE_URL
import `fun`.fantasea.bangumiapi.util.ifThen
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Request

class GetEpisodes(
    private val subjectId: Int,
    private val type: EpisodeType? = null,
    private val limit: Int = 100,
    private val offset: Int = 0,
) : Api<EpisodeCollection> {
    override val path: String
        get() = "/v0/episodes"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(
                (BASE_URL + path)
                    .toHttpUrl()
                    .newBuilder()
                    .addQueryParameter("subject_id", subjectId.toString())
                    .ifThen(type != null) { addQueryParameter("type", type!!.value.toString()) }
                    .addQueryParameter("limit", limit.toString())
                    .addQueryParameter("offset", offset.toString())
                    .build()
            )
            .get()
            .build()
    }
}
