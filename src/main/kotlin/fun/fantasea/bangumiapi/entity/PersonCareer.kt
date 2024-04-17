package `fun`.fantasea.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * producer, mangaka, artist, seiyu, writer, illustrator, actor
 */
enum class PersonCareer(val value: String) {
    PRODUCER("producer"),
    MANGAKA("mangaka"),
    ARTIST("artist"),
    SEIYU("seiyu"),
    WRITER("writer"),
    ILLUSTRATOR("illustrator"),
    ACTOR("actor"),
    ;

    @JsonValue
    fun toJson(): String {
        return value
    }
}
