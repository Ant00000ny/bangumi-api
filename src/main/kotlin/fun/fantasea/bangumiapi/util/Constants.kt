package `fun`.fantasea.bangumiapi.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule
import okhttp3.MediaType.Companion.toMediaType

internal const val BASE_URL = "https://api.bgm.tv"

val om: ObjectMapper = ObjectMapper().registerModules(kotlinModule())

internal val APPLICATION_JSON = "application/json".toMediaType()
