package `fun`.fantasea.bangumiapi.api.collection

import `fun`.fantasea.bangumiapi.api.collection.subject.GetUserSingleCollection
import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.util.toJsonString
import org.junit.jupiter.api.Test

class GetUserSingleCollectionTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetUserSingleCollection("738090", 9912))
        println(result.toJsonString(true))
    }
}
