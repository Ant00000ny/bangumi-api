package `fun`.fantasea.nano.bangumiapi.api.episode

import `fun`.fantasea.nano.bangumiapi.api.Api
import `fun`.fantasea.nano.bangumiapi.entity.EpisodeType
import `fun`.fantasea.nano.bangumiapi.entity.respentity.EpisodeCollection
import `fun`.fantasea.nano.bangumiapi.util.baseUrl
import `fun`.fantasea.nano.bangumiapi.util.ifThen
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
                (baseUrl + path)
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
