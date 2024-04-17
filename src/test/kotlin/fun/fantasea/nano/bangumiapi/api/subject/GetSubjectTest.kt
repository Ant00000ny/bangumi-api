package `fun`.fantasea.nano.bangumiapi.api.subject

import `fun`.fantasea.nano.bangumiapi.bangumiClient
import `fun`.fantasea.nano.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetSubjectTest {

    @Test
    fun execute() {
        val result = bangumiClient.execute(GetSubject(79227))
        println(result.toJsonString(true))
    }
}
