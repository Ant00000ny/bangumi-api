package `fun`.fantasea.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 1, 2, 3 表示 个人, 公司, 组合
 */
enum class PersonType(val value: Int) {
    PERSON(1),
    COMPANY(2),
    GROUP(3),
    ;

    @JsonValue
    fun fromValue(value: Int): PersonType {
        return entries.first { it.value == value }
    }
}
