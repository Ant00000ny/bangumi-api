package `fun`.fantasea.bangumiapi.api.collection.subject

import `fun`.fantasea.bangumiapi.api.Api
import `fun`.fantasea.bangumiapi.entity.CollectionType
import `fun`.fantasea.bangumiapi.entity.SubjectType
import `fun`.fantasea.bangumiapi.entity.UserSubject
import `fun`.fantasea.bangumiapi.entity.respentity.DataCollection
import `fun`.fantasea.bangumiapi.util.BASE_URL
import `fun`.fantasea.bangumiapi.util.ifThen
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Request

/**
 * 获取用户收藏的条目。
 */
class GetUserCollection(
    /**
     * 用户名。未设置用户名的，使用 UID。
     */
    private val username: String,
    /**
     * 条目类型。
     *
     * @see SubjectType
     */
    private val subjectType: SubjectType? = null,
    /**
     * 集合类型。
     *
     * @see CollectionType
     */
    private val type: CollectionType? = null,
    /**
     * 分页大小。
     */
    private val limit: Int? = null,
    /**
     * 页码。
     */
    private val offset: Int? = null,
) : Api<DataCollection<UserSubject>> {
    override val path: String
        get() = "/v0/users/$username/collections"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(
                (BASE_URL + path)
                    .toHttpUrl()
                    .newBuilder()
                    .ifThen(subjectType != null) { addQueryParameter("subject_type", subjectType!!.value.toString()) }
                    .ifThen(type != null) { addQueryParameter("type", type!!.value.toString()) }
                    .ifThen(limit != null) { addQueryParameter("limit", limit.toString()) }
                    .ifThen(offset != null) { addQueryParameter("offset", offset.toString()) }
                    .build()
            )
            .get()
            .build()

    }
}
