package `fun`.fantasea.bangumiapi

import `fun`.fantasea.bangumiapi.api.BangumiClient

val accessToken: String? = System.getenv("BANGUMI_ACCESS_TOKEN")

val bangumiClient = BangumiClient(accessToken)
