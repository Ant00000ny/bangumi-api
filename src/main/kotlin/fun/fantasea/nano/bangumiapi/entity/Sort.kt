package `fun`.fantasea.nano.bangumiapi.entity

/**
 * match meilisearch 的默认排序，按照匹配程度
 * heat 收藏人数
 * rank 排名由高到低
 * score 评分
 */
enum class Sort(private val value: String) {
    MATCH("match"),
    HEAT("heat"),
    RANK("rank"),
    SCORE("score");

    override fun toString(): String {
        return value
    }
}
