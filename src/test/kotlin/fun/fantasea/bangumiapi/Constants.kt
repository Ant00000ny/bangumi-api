package `fun`.fantasea.bangumiapi

import `fun`.fantasea.bangumiapi.api.BangumiClient

val accessToken = System.getenv("BANGUMI_ACCESS_TOKEN")
    ?: error("required system env BANGUMI_ACCESS_TOKEN not found")

val bangumiClient = BangumiClient(accessToken)
