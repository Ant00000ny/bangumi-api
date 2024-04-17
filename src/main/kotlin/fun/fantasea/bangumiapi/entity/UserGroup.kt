package `fun`.fantasea.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 用户组 - 1 = 管理员 - 2 = Bangumi 管理猿 - 3 = 天窗管理猿 - 4 = 禁言用户 - 5 = 禁止访问用户 - 8 = 人物管理猿 - 9 = 维基条目管理猿 - 10 = 用户 - 11 = 维基人
 */
enum class UserGroup(val value: Int) {
    ADMIN(1),
    BANGUMI_ADMIN(2),
    WINDOW_ADMIN(3),
    BAN_USER(4),
    BAN_ACCESS(5),
    PERSON_ADMIN(8),
    WIKI_ADMIN(9),
    USER(10),
    WIKI_USER(11),
    ;

    @JsonValue
    fun value(): Int {
        return value
    }
}
