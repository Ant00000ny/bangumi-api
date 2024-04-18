package `fun`.fantasea.bangumiapi.entity.respentity

import `fun`.fantasea.bangumiapi.entity.Details

/**
 * ```json
 * {
 *   "title": "Bad Request",
 *   "details": {
 *     "path": "/v0/users/-/collections/9912",
 *     "method": "POST"
 *   },
 *   "description": "can't set 'vol_status' or 'ep_status' on non-book subject"
 * }
 * ```
 */
data class ErrorDetail(
    val title: String,
    val details: Details,
    val description: String,
)
