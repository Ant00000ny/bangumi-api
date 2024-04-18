package `fun`.fantasea.bangumiapi.api.episode

import `fun`.fantasea.bangumiapi.api.collection.subject.GetUserCollection
import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.entity.CollectionType
import `fun`.fantasea.bangumiapi.entity.SubjectType
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetUserCollectionTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetUserCollection("738090", SubjectType.ANIME, CollectionType.COLLECTED, 30, 0))
        println(result.toJsonString(true))
    }
}
