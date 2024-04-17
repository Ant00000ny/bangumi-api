package `fun`.fantasea.nano.bangumiapi.api.user

import `fun`.fantasea.nano.bangumiapi.accessToken
import `fun`.fantasea.nano.bangumiapi.bangumiClient
import `fun`.fantasea.nano.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetMeTest {
    @Test
    fun testExecute() {
        val me = bangumiClient.execute(GetMe(accessToken))
        println(me.toJsonString(true))
    }
}
