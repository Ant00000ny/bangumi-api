package `fun`.fantasea.nano.bangumiapi.api.subject

import `fun`.fantasea.nano.bangumiapi.bangumiClient
import `fun`.fantasea.nano.bangumiapi.entity.SubjectSearchFilter
import `fun`.fantasea.nano.bangumiapi.entity.SubjectType
import `fun`.fantasea.nano.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class SearchSubjectsTest {
    @Test
    fun execute() {
        val searchSubjectCollection = bangumiClient.execute(
            SearchSubjects(
                keyword = "no game",
                filter = SubjectSearchFilter(
                    type = listOf(SubjectType.ANIME),
                )

            )
        )
        println(searchSubjectCollection.toJsonString(true))
    }
}
