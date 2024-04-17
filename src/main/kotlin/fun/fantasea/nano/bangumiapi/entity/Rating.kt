package `fun`.fantasea.nano.bangumiapi.entity

data class Rating(
    val rank: Int,
    val total: Int,
    val count: Map<String, Int>,
    val score: Double,
)
