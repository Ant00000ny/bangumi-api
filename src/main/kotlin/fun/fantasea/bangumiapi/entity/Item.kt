package `fun`.fantasea.bangumiapi.entity

data class Item(
    val id: Int,
    val url: String,
    val type: Int,
    val name: String,
    val name_cn: String,
    val summary: String,
    val air_date: String,
    val air_weekday: Int,
    val rating: Rating,
    val rank: Int? = null,
    val images: Images,
    val collection: Collection,
)
