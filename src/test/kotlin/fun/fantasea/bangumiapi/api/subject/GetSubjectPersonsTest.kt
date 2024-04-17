package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetSubjectPersonsTest {
    @Test
    fun execute() {
        val persons = bangumiClient.execute(GetSubjectPersons(114514))
        println(persons.toJsonString(true))
    }
}
