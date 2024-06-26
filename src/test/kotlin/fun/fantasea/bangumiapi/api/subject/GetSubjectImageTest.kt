package `fun`.fantasea.bangumiapi.api.subject

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.entity.Type
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class GetSubjectImageTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetSubjectImage(9912, Type.COMMON))
        assertTrue { result.isNotEmpty() }
    }
}
