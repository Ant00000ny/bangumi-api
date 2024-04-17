package `fun`.fantasea.bangumiapi.api.user

import `fun`.fantasea.bangumiapi.bangumiClient
import `fun`.fantasea.bangumiapi.entity.Type
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class GetUserAvatarByNameTest {
    @Test
    fun execute() {
        val result = bangumiClient.execute(GetUserAvatarByName("155125", Type.MEDIUM))
        assertTrue { result.isNotEmpty() }
    }
}
