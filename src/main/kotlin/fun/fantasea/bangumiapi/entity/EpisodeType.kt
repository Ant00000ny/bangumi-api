package `fun`.fantasea.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 0 本篇，1 SP，2 OP，3 ED
 */
enum class EpisodeType(val value: Int) {
    MAIN(0),
    SP(1),
    OP(2),
    ED(3),
    ;

    @JsonValue
    fun value(): Int {
        return value
    }
}
