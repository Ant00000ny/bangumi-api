package `fun`.fantasea.bangumiapi.entity


/**
 * ```json
 * [
 *   {
 *     "images": {
 *       "small": "https://lain.bgm.tv/r/100/pic/crt/l/5b/11/47391_prsn_2HqL2.jpg",
 *       "grid": "https://lain.bgm.tv/r/200/pic/crt/l/5b/11/47391_prsn_2HqL2.jpg",
 *       "large": "https://lain.bgm.tv/pic/crt/l/5b/11/47391_prsn_2HqL2.jpg",
 *       "medium": "https://lain.bgm.tv/r/400/pic/crt/l/5b/11/47391_prsn_2HqL2.jpg"
 *     },
 *     "name": "コミックブリーゼ",
 *     "relation": "连载杂志",
 *     "career": [
 *       "producer"
 *     ],
 *     "type": 2,
 *     "id": 47391
 *   },
 *   {
 *     "images": {
 *       "small": "https://lain.bgm.tv/r/100/pic/crt/l/b8/eb/48413_prsn_MYdc7.jpg",
 *       "grid": "https://lain.bgm.tv/r/200/pic/crt/l/b8/eb/48413_prsn_MYdc7.jpg",
 *       "large": "https://lain.bgm.tv/pic/crt/l/b8/eb/48413_prsn_MYdc7.jpg",
 *       "medium": "https://lain.bgm.tv/r/400/pic/crt/l/b8/eb/48413_prsn_MYdc7.jpg"
 *     },
 *     "name": "菊屋きく子",
 *     "relation": "作者",
 *     "career": [
 *       "mangaka"
 *     ],
 *     "type": 1,
 *     "id": 48413
 *   },
 *   {
 *     "images": {
 *       "small": "https://lain.bgm.tv/r/100/pic/crt/l/2a/0c/8495_prsn_gFOpH.jpg",
 *       "grid": "https://lain.bgm.tv/r/200/pic/crt/l/2a/0c/8495_prsn_gFOpH.jpg",
 *       "large": "https://lain.bgm.tv/pic/crt/l/2a/0c/8495_prsn_gFOpH.jpg",
 *       "medium": "https://lain.bgm.tv/r/400/pic/crt/l/2a/0c/8495_prsn_gFOpH.jpg"
 *     },
 *     "name": "キルタイムコミュニケーション",
 *     "relation": "出版社",
 *     "career": [
 *       "producer"
 *     ],
 *     "type": 2,
 *     "id": 8495
 *   }
 * ]
 * ```
 */
data class RelatedPerson(
    val images: Images,
    val name: String,
    val relation: String,
    val career: List<PersonCareer>,
    val type: PersonType,
    val id: Int,
)
