package `fun`.fantasea.bangumiapi.api.collection.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.dto.ModifyCollectionDTO
import `fun`.fantasea.bangumiapi.util.APPLICATION_JSON
import `fun`.fantasea.bangumiapi.util.BASE_URL
import `fun`.fantasea.bangumiapi.util.toJsonString
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

/**
 * 修改条目收藏状态, 如果不存在则创建，如果存在则修改
 *
 * 由于直接修改剧集条目的完成度可能会引起意料之外效果，只能用于修改书籍类条目的完成度。
 *
 * todo test
 */
class ModifySingleCollection(
    private val subjectId: String,
    private val body: ModifyCollectionDTO? = null,
) : Api<Unit> {
    override val path: String
        get() = "/v0/users/-/collections/$subjectId"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(BASE_URL + path)
            .post(
                body
                    .toJsonString()
                    .toRequestBody(APPLICATION_JSON)
            )
            .build()
    }
}
