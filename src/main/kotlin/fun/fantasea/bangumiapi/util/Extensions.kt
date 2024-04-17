package `fun`.fantasea.bangumiapi.util

import com.fasterxml.jackson.module.kotlin.readValue
import `fun`.fantasea.bangumiapi.exception.BangumiApiException

inline fun <T> T.ifThen(ifCondition: Boolean, thenDo: T.() -> T): T = if (ifCondition) thenDo() else this

inline fun <reified T> String.convertTo(): T = om
    .runCatching { readValue<T>(this@convertTo) }
    .getOrElse { throw BangumiApiException("Failed to deserialize, content is: \n$this", it) }

internal fun Any?.toJsonString(pretty: Boolean = false): String = om
    .let { if (pretty) it.writerWithDefaultPrettyPrinter() else it.writer() }
    .writeValueAsString(this)
