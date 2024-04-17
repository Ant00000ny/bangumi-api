package `fun`.fantasea.bangumiapi.entity

data class UserSubject(
    val updated_at: String,
    val comment: Any?, // todo check type
    val tags: List<Tag>,
    val subject: Subject,
    val subject_id: Int,
    val vol_status: Int,
    val ep_status: Int,
    val subject_type: Int,
    val type: Int,
    val rate: Int,
    val private: Boolean,
)
