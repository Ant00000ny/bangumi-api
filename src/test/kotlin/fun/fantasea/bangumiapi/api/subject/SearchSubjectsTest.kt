package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.entity.SubjectSearchFilter
import `fun`.fantasea.bangumiapi.entity.SubjectType
import `fun`.fantasea.bangumiapi.util.toJsonString
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
