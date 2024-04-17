package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetUserByNameTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetUserByName("155125"))
        println(result.toJsonString(true))
    }
}
