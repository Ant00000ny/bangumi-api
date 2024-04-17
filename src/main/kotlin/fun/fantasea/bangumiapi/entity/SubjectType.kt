package `fun`.fantasea.bangumiapi.entity

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 1 为 书籍
 * 2 为 动画
 * 3 为 音乐
 * 4 为 游戏
 * 6 为 三次元
 */
enum class SubjectType(val value: Int) {
    BOOK(1),
    ANIME(2),
    MUSIC(3),
    GAME(4),
    REAL(6),
    ;

    @JsonValue
    fun value(): Int {
        return value
    }
}
