package `fun`.fantasea.bangumiapi.util

import `fun`.fantasea.bangumiapi.exception.BangumiApiException

inline fun <T> T.ifThen(ifCondition: Boolean, thenDo: T.() -> T): T = if (ifCondition) thenDo() else this

fun <T> String.convertTo(clazz: Class<T>): T = om
    .runCatching { readValue(this@convertTo, clazz) }
    .getOrElse { throw BangumiApiException("Failed to deserialize, content is: \n$this", it) }

internal fun Any?.toJsonString(pretty: Boolean = false): String = om
    .let { if (pretty) it.writerWithDefaultPrettyPrinter() else it.writer() }
    .writeValueAsString(this)
