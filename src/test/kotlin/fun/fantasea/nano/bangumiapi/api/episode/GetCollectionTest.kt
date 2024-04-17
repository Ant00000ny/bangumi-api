package `fun`.fantasea.nano.bangumiapi.api.episode

import `fun`.fantasea.nano.bangumiapi.api.collection.GetCollection
import `fun`.fantasea.nano.bangumiapi.bangumiClient
import `fun`.fantasea.nano.bangumiapi.entity.CollectionType
import `fun`.fantasea.nano.bangumiapi.entity.SubjectType
import `fun`.fantasea.nano.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetCollectionTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetCollection("738090", SubjectType.ANIME, CollectionType.COLLECTED, 30, 0))
        println(result.toJsonString(true))
    }
}
