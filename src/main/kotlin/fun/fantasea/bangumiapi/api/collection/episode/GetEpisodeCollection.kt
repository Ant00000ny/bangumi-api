package `fun`.fantasea.bangumiapi.api.collection.episode

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.EpisodeType
import `fun`.fantasea.bangumiapi.entity.respentity.DataCollection
import `fun`.fantasea.bangumiapi.entity.respentity.UserEpisode
import `fun`.fantasea.bangumiapi.util.BASE_URL
import `fun`.fantasea.bangumiapi.util.ifThen
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Request

class GetEpisodeCollection(
    private val subjectId: Int,
    private val limit: Int? = null,
    private val offset: Int? = null,
    private val episodeType: EpisodeType? = null,
) : Api<DataCollection<UserEpisode>> {
    override val path: String
        get() = "/v0/users/-/collections/$subjectId/episodes"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(
                (BASE_URL + path)
                    .toHttpUrl()
                    .newBuilder()
                    .ifThen(limit != null) { addQueryParameter("limit", limit.toString()) }
                    .ifThen(offset != null) { addQueryParameter("offset", offset.toString()) }
                    .ifThen(episodeType != null) { addQueryParameter("episode_type", episodeType!!.value.toString()) }
                    .build()
            )
            .get()
            .build()
    }
}
