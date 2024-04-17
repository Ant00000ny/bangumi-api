package `fun`.fantasea.nano.bangumiapi

import `fun`.fantasea.nano.bangumiapi.api.BangumiClient

val accessToken = System.getenv("BANGUMI_ACCESS_TOKEN")
    ?: error("BANGUMI_ACCESS_TOKEN not found")

val bangumiClient = BangumiClient(accessToken)
