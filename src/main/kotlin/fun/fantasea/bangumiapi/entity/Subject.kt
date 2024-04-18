package `fun`.fantasea.bangumiapi.entity

data class Subject(
    val id: Int,
    val type: Int,
    val name: String,
    val name_cn: String,
    val short_summary: String,
    val date: String,
    val images: Images,
    val volumes: Int,
    val eps: Int,
    val collection_total: Int,
    val score: Double,
    val tags: List<Tag>,
    val rank: Int,
)
