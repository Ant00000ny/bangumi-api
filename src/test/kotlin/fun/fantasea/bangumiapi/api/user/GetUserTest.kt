package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetUserTest {
    @Test
    fun testExecute() {
        val user = bangumiClient.execute(GetUser())
        println(user.toJsonString(true))
    }
}
