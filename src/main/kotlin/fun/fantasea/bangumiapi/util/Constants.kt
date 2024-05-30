package `fun`.fantasea.bangumiapi.util

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule
import okhttp3.MediaType.Companion.toMediaType

internal const val BASE_URL = "https://api.bgm.tv"

internal val om: ObjectMapper = ObjectMapper()
    .registerModules(kotlinModule())
    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)

internal val APPLICATION_JSON = "application/json".toMediaType()
