package `fun`.fantasea.bangumiapi.entity.respentity

data class DataCollection<T>(
    val data: List<T>,
    val total: Int,
    val limit: Int,
    val offset: Int,
)
