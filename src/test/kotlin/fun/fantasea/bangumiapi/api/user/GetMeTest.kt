package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.accessToken
import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetMeTest {
    @Test
    fun testExecute() {
        val me = bangumiClient.execute(GetMe(accessToken))
        println(me.toJsonString(true))
    }
}
