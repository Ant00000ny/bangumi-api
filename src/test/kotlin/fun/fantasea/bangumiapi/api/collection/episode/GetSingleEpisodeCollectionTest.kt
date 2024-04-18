package `fun`.fantasea.bangumiapi.api.collection.episode

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetSingleEpisodeCollectionTest {
    @Test
    fun test() {
        val result = bangumiClient.execute(GetSingleEpisodeCollection(77560))
        println(result.toJsonString(true))
    }
}
