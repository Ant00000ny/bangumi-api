package `fun`.fantasea.nano.bangumiapi.entity

data class SearchSubject(
    val date: String,
    val image: String,
    val type: Int,
    val summary: String,
    val name: String,
    val name_cn: String,
    val tags: List<Tag>,
    val score: Int,
    val id: Int,
    val rank: Int,
)
