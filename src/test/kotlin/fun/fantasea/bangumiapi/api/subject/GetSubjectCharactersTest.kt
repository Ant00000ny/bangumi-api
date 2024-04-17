package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetSubjectCharactersTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetSubjectCharacters(9912))
        println(result.toJsonString(true))
    }
}
