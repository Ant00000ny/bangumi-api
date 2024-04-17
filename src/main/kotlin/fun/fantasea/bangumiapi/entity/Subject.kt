package `fun`.fantasea.bangumiapi.entity

data class Subject(
    val date: String,
    val images: Images,
    val name: String,
    val name_cn: String,
    val short_summary: String,
    val tags: List<Tag>,
    val score: Double,
    val type: Int,
    val id: Int,
    val eps: Int,
    val volumes: Int,
    val collection_total: Int,
    val rank: Int,
)
