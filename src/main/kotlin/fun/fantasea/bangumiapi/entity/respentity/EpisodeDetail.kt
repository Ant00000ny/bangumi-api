package `fun`.fantasea.bangumiapi.entity.respentity

/**
 * ```json
 * {
 *   "airdate": "2005-06-08",
 *   "name": "たけくらべ 二人の美登利",
 *   "name_cn": "",
 *   "duration": "",
 *   "desc": "",
 *   "ep": 10,
 *   "sort": 10,
 *   "id": 9912,
 *   "subject_id": 1961,
 *   "comment": 6,
 *   "type": 0,
 *   "disc": 0,
 *   "duration_seconds": 0
 * }
 * ```
 */
data class EpisodeDetail(
    val airdate: String,
    val name: String,
    val name_cn: String,
    val duration: String,
    val desc: String,
    val ep: Int?,
    val sort: Int,
    val id: Int,
    val subject_id: Int,
    val comment: Int,
    val type: Int,
    val disc: Int,
    val duration_seconds: Int,
)
