package `fun`.fantasea.bangumiapi.api.episode

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetEpisodeTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetEpisode(9902))
        println(result.toJsonString(true))
    }
}
