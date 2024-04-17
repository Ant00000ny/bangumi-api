package `fun`.fantasea.bangumiapi.entity.respentity

import `fun`.fantasea.bangumiapi.entity.Avatar
import `fun`.fantasea.bangumiapi.entity.UserGroup

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
data class User(
    val id: Int,
    val username: String,
    val nickname: String,
    val user_group: UserGroup,
    val avatar: Avatar,
    val sign: String,
    val url: String,
)
