package `fun`.fantasea.bangumiapi.entity.respentity

import `fun`.fantasea.bangumiapi.entity.SearchSubject

/**
 * ```json
 * {
 *   "data": [
 *     {
 *       "date": "2006-10-04",
 *       "image": "https://lain.bgm.tv/pic/cover/l/02/e2/147828_DFMF2.jpg",
 *       "type": 2,
 *       "summary": "　　影片继承了奎氏兄弟和史云梅耶的传统，是一部为成年人所拍摄的手工制作停格动画片。故事讲述白鼠贵族与橡树底下寄居的乡村动物之间为了争夺心爱的玩偶而进行的斗争。 \r\n　　荣获2006年美国三藩市独立电影节最佳动画片",
 *       "name": "Blood Tea and Red String",
 *       "name_cn": "血茶与红绳",
 *       "tags": [
 *         {
 *           "name": "欧美",
 *           "count": 5
 *         },
 *         {
 *           "name": "猎奇",
 *           "count": 4
 *         },
 *         {
 *           "name": "2006",
 *           "count": 3
 *         },
 *         {
 *           "name": "动画电影",
 *           "count": 3
 *         },
 *         {
 *           "name": "剧场版",
 *           "count": 3
 *         },
 *         {
 *           "name": "恐怖",
 *           "count": 2
 *         },
 *         {
 *           "name": "原创",
 *           "count": 2
 *         },
 *         {
 *           "name": "2000s",
 *           "count": 1
 *         },
 *         {
 *           "name": "剧场",
 *           "count": 1
 *         },
 *         {
 *           "name": "美国",
 *           "count": 1
 *         },
 *         {
 *           "name": "剧情",
 *           "count": 1
 *         },
 *         {
 *           "name": "00",
 *           "count": 1
 *         }
 *       ],
 *       "score": 7,
 *       "id": 147828,
 *       "rank": 0
 *     },
 *   ],
 *   "total": 350,
 *   "limit": 50,
 *   "offset": 0
 * }
 * ```
 */
data class SearchSubjectCollection(
    val data: List<SearchSubject>,
    val total: Int,
    val limit: Int,
    val offset: Int,
) : ApiResponseEntity
