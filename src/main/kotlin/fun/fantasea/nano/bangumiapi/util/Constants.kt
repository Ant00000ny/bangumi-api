package `fun`.fantasea.nano.bangumiapi.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule
import okhttp3.OkHttpClient

/**
 * This is the OkHttpClient for Bangumi API.
 *
 * Should not be used in other module.
 */
val bangumiOkhttpClient = OkHttpClient.Builder()
    .followRedirects(true)
    .addInterceptor { chain ->
        val request = chain.request().newBuilder()
            .addHeader("User-Agent", "ant00000ny/nano")
            .build()
        chain.proceed(request)
    }
    .build()

internal const val baseUrl = "https://api.bgm.tv"

val om: ObjectMapper = ObjectMapper().registerModules(kotlinModule())
