package `fun`.fantasea.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 0: 未收藏
 * 1: 想看
 * 2: 看过
 * 3: 抛弃
 */
enum class EpisodeCollectionType(val value: Int) {
    NONE(0),
    WISH(1),
    WATCHED(2),
    DROP(3),
    ;

    @JsonValue
    fun value(): Int {
        return value
    }
}
