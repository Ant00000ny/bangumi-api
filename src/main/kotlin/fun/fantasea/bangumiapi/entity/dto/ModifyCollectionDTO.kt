package `fun`.fantasea.bangumiapi.entity.dto

import `fun`.fantasea.bangumiapi.entity.CollectionType

/**
 * ```json
 * {
 *   "type": 3,
 *   "rate": 10,
 *   "ep_status": 0,
 *   "vol_status": 0,
 *   "comment": "string",
 *   "private": true,
 *   "tags": [
 *     "string"
 *   ]
 * }
 * ```
 *
 * todo
 */
data class ModifyCollectionDTO(
    val type: CollectionType? = null,
    val rate: Int? = null,
    val ep_status: Int? = null,
    val vol_status: Int? = null,
    val comment: String? = null,
    val private: Boolean? = null,
    val tags: List<String>? = null,
)
