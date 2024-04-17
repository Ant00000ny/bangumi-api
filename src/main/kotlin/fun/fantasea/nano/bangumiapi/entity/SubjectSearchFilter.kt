package `fun`.fantasea.nano.bangumiapi.entity

class SubjectSearchFilter(
    val type: List<SubjectType> = emptyList(),
    val tag: List<Tag> = emptyList(),
    val airDate: List<String> = emptyList(),
    val rating: List<String> = emptyList(),
    val rank: List<String> = emptyList(),
    var nsfw: Boolean = false,
)
