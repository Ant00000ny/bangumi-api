package `fun`.fantasea.bangumiapi.api.character

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetPersonTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetPerson(7890))
        println(result.toJsonString(true))
    }
}
