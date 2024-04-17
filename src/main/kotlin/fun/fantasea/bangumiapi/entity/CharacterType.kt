package `fun`.fantasea.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 角色，机体，舰船，组织...
 *
 * [ 1, 2, 3, 4 ]
 */
enum class CharacterType(val value: Int) {
    CHARACTER(1),
    MECHA(2),
    SHIP(3),
    ORGANIZATION(4),
    ;

    @JsonValue
    fun value(): Int {
        return value
    }
}
