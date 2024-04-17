package `fun`.fantasea.nano.bangumiapi.util

import com.fasterxml.jackson.module.kotlin.readValue

inline fun <T> T.ifThen(ifCondition: Boolean, thenDo: T.() -> T): T = if (ifCondition) thenDo() else this

inline fun <T : Any> T?.ifNull(block: () -> T): T = this ?: block()

inline fun <reified T> String.convertTo(): T = om.readValue<T>(this)

fun Any?.toJsonString(pretty: Boolean = false): String = om
    .let { if (pretty) it.writerWithDefaultPrettyPrinter() else it.writer() }
    .writeValueAsString(this)
