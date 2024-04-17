package `fun`.fantasea.bangumiapi.api.episode

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetEpisodesTest {
    @Test
    fun execute() {
        val episodeCollection = bangumiClient.execute(GetEpisodes(79227))
        println(episodeCollection.toJsonString(true))
    }
}
