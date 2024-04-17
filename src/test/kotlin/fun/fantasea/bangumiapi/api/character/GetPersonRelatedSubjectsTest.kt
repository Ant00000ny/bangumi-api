package `fun`.fantasea.bangumiapi.api.character

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetPersonRelatedSubjectsTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetPersonRelatedSubjects(7890))
        println(result.toJsonString(true))
    }
}
