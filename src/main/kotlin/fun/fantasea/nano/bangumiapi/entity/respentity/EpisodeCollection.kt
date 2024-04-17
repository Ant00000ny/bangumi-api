package `fun`.fantasea.nano.bangumiapi.entity.respentity

import `fun`.fantasea.nano.bangumiapi.entity.Episode

/**
 * ```json
 * {
 *   "data": [
 *     {
 *       "airdate": "2014-04-09",
 *       "name": "素人《ビギナー》",
 *       "name_cn": "外行人（Beginner）",
 *       "duration": "00:23:45",
 *       "desc": "ニートでヒキコモリ……だがネット上では「　　」(くうはく)の名で無敗を誇る天才ゲーマー兄妹・空(そら)と白(しろ)。ただの都市伝説とまで言われるほどの常識外れな腕前を持つ空と白のもとに、ある日\"神\"を名乗る少年・テトが現れる。\r\n\r\nテトはリアルをクソゲーと呼ぶ空と白の二人を、一切の争いが禁じられ、全てがゲームで決まる盤上の世界\"ディスボード\"へと召喚してしまう。\r\n\r\n脚本：花田十輝\r\n絵コンテ：いしづかあつこ\r\n演出：いしづかあつこ\r\n作画監督：大舘康二",
 *       "ep": 1,
 *       "sort": 1,
 *       "id": 385150,
 *       "subject_id": 79227,
 *       "comment": 89,
 *       "type": 0,
 *       "disc": 0,
 *       "duration_seconds": 1425
 *     },
 *     {
 *       "airdate": "2014-04-16",
 *       "name": "挑戦者《チャレンジャー》",
 *       "name_cn": "挑战者（Challenger）",
 *       "duration": "00:23:59",
 *       "desc": "テトによって異世界へと放り出された空と白。そこは一切の争いが禁じられ、全てがゲームの勝敗によって左右されるというテトが定めた\"十の盟約\"により縛られた世界だった。\r\n\r\n異世界に住まう十六の種族のうち最弱の種族である\"人類種'(イマニティ)\"の国、エルキアにたどり着いた空と白は、エルキアの前国王の孫娘、ステファニー・ドーラことステフと出会い、次期国王を選定するギャンブル大会に挑む。\r\n\r\n脚本：花田十輝\r\n絵コンテ：渡邉こと乃\r\n演出：池端隆史\r\n作画監督：小関　雅",
 *       "ep": 2,
 *       "sort": 2,
 *       "id": 385151,
 *       "subject_id": 79227,
 *       "comment": 58,
 *       "type": 0,
 *       "disc": 0,
 *       "duration_seconds": 1439
 *     }
 *   ],
 *   "total": 18,
 *   "limit": 100,
 *   "offset": 0
 * }
 * ```
 */
data class EpisodeCollection(
    val data: List<Episode>,
    val total: Int,
    val limit: Int,
    val offset: Int,
) : ApiResponseEntity
