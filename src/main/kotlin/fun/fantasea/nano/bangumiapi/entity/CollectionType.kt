package `fun`.fantasea.nano.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 1: 想看
 * 2: 看过
 * 3: 在看
 * 4: 搁置
 * 5: 抛弃
 */
enum class CollectionType(val value: Int) {
    WISH(1),
    COLLECTED(2),
    WATCHING(3),
    ON_HOLD(4),
    DROPPED(5),
    ;

    @JsonValue
    override fun toString(): String {
        return value.toString()
    }
}
