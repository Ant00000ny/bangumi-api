package `fun`.fantasea.bangumiapi.entity

data class Episode(
    val airdate: String,
    val name: String,
    val name_cn: String,
    val duration: String,
    val desc: String,
    val ep: Int,
    val sort: Int,
    val id: Int,
    val subject_id: Int,
    val comment: Int,
    val type: Int,
    val disc: Int,
    val duration_seconds: Int,
)
