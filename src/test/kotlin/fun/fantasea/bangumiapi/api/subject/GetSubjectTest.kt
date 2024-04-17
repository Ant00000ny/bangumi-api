package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetSubjectTest {

    @Test
    fun execute() {
        val result = bangumiClient.execute(GetSubject(79227))
        println(result.toJsonString(true))
    }
}
