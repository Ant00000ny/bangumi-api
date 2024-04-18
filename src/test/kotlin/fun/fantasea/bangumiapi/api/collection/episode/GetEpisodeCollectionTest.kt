package `fun`.fantasea.bangumiapi.api.collection.episode

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetEpisodeCollectionTest {
    @Test
    fun test() {
        val result = bangumiClient.execute(
            GetEpisodeCollection(
                subjectId = 9912,
            )
        )

        println(result.toJsonString(true))
    }
}
