import `fun`.fantasea.bangumiapi.entity.Images

data class Actor(
    val images: Images,
    val name: String,
    val short_summary: String,
    val career: List<String>,
    val id: Int,
    val type: Int,
    val locked: Boolean,
)
