package `fun`.fantasea.nano.bangumiapi.api.episode

import `fun`.fantasea.nano.bangumiapi.bangumiClient
import `fun`.fantasea.nano.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetEpisodesTest {
    @Test
    fun execute() {
        val episodeCollection = bangumiClient.execute(GetEpisodes(79227))
        println(episodeCollection.toJsonString(true))
    }
}
