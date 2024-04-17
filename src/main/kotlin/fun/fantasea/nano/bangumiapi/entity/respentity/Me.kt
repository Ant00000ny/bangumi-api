package `fun`.fantasea.nano.bangumiapi.entity.respentity

import `fun`.fantasea.nano.bangumiapi.entity.Avatar

/**
 * ```json
 * {
 *   "avatar": {
 *     "large": "https://lain.bgm.tv/pic/user/l/000/73/80/738090.jpg?r=1667145341",
 *     "medium": "https://lain.bgm.tv/r/200/pic/user/l/000/73/80/738090.jpg?r=1667145341",
 *     "small": "https://lain.bgm.tv/r/100/pic/user/l/000/73/80/738090.jpg?r=1667145341"
 *   },
 *   "sign": "",
 *   "url": "https://bgm.tv/user/738090",
 *   "username": "738090",
 *   "nickname": "Ant00000ny",
 *   "id": 738090,
 *   "user_group": 10
 * }
 * ```
 */
data class Me(
    val avatar: Avatar,
    val sign: String,
    val url: String,
    val username: String,
    val nickname: String,
    val id: Int,
    val user_group: Int,
) : ApiResponseEntity
