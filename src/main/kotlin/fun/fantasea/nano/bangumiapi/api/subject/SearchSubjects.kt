package `fun`.fantasea.nano.bangumiapi.api.subject

import `fun`.fantasea.nano.bangumiapi.api.Api
import `fun`.fantasea.nano.bangumiapi.entity.Sort
import `fun`.fantasea.nano.bangumiapi.entity.SubjectSearchFilter
import `fun`.fantasea.nano.bangumiapi.entity.respentity.SearchSubjectCollection
import `fun`.fantasea.nano.bangumiapi.util.baseUrl
import `fun`.fantasea.nano.bangumiapi.util.om
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

/**
 * 请求体：
 * ```json
 * {
 *   "keyword": "string",
 *   "sort": "rank",
 *   "filter": {
 *     "type": [
 *       2
 *     ],
 *     "tag": [
 *       "童年",
 *       "原创"
 *     ],
 *     "air_date": [
 *       ">=2020-07-01",
 *       "<2020-10-01"
 *     ],
 *     "rating": [
 *       ">=6",
 *       "<8"
 *     ],
 *     "rank": [
 *       ">10",
 *       "<=18"
 *     ],
 *     "nsfw": true
 *   }
 * }
 * ```
 */
class SearchSubjects(
    private val keyword: String,
    private val sort: Sort? = null,
    private val filter: SubjectSearchFilter? = null,
) : Api<SearchSubjectCollection> {
    override val path: String
        get() = "/v0/search/subjects"

    override fun getRequest(): Request {
        return Request.Builder()
            .url(baseUrl + path)
            .post(
                om.writeValueAsString(
                    mapOf(
                        "keyword" to keyword,
                        "sort" to sort?.toString(),
                        "filter" to filter
                    )
                ).toRequestBody("application/json".toMediaType())
            )
            .build()
    }
}
