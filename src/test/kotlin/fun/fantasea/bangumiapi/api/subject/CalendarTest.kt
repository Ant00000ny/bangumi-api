package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class CalendarTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(Calendar())
        println(result.toJsonString(true))
    }
}
