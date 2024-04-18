package `fun`.fantasea.bangumiapi.entity.respentity

import `fun`.fantasea.bangumiapi.entity.Episode
import `fun`.fantasea.bangumiapi.entity.EpisodeType

/**
 * ```json
 * {
 *       "episode": {
 *         "airdate": "2011-04-02",
 *         "name": "日常の第一話",
 *         "name_cn": "",
 *         "duration": "",
 *         "desc": "分镜、演出：石原立也\r\n演出辅佐：武本康弘\r\n作监：西屋太志\r\n作监辅佐：门胁未来",
 *         "ep": 1,
 *         "sort": 1,
 *         "id": 77560,
 *         "subject_id": 9912,
 *         "comment": 63,
 *         "type": 0,
 *         "disc": 0,
 *         "duration_seconds": 0
 *       },
 *       "type": 0
 *     }
 * ```
 */
data class UserEpisode(
    val episode: Episode,
    val type: EpisodeType,
)
