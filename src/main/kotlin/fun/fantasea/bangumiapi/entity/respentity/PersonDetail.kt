package `fun`.fantasea.bangumiapi.entity.respentity

import `fun`.fantasea.bangumiapi.entity.*

/**
 * ```json
 * {
 *   "last_modified": "0001-01-01T00:00:00Z",
 *   "blood_type": null,
 *   "birth_year": null,
 *   "birth_day": 27,
 *   "birth_mon": 8,
 *   "gender": "female",
 *   "images": {
 *     "small": "https://lain.bgm.tv/r/100/pic/crt/l/a5/1d/7890_prsn_RkZYG.jpg",
 *     "grid": "https://lain.bgm.tv/r/200/pic/crt/l/a5/1d/7890_prsn_RkZYG.jpg",
 *     "large": "https://lain.bgm.tv/pic/crt/l/a5/1d/7890_prsn_RkZYG.jpg",
 *     "medium": "https://lain.bgm.tv/r/400/pic/crt/l/a5/1d/7890_prsn_RkZYG.jpg"
 *   },
 *   "summary": "天乙 准花（あまおと じゅんか ），日本声优兼歌手，同时还以JUNCA的名义参与同人团体（てつ×ねこ、Team.ねこかん[猫]）的活动。\r\n\r\n人物信息补充\r\n　　①天乙准花中的“准花”，据说是因为玩勇者斗恶龙VI 幻之大地，在设定角色名时输入原来的名字却无法显示，于是想出的新名字。因为这个游戏放弃考试等等，与之有关的事情非常的多。\r\n　　②极度缺乏方向感，诸如搬家后回不了家，迷路等等不一而足。\r\n　　③对各种熊猫都非常喜欢，熊猫相关商品收集中……\r\n　　④不仅仅参加活动和现场演出，还会穿着熊猫睡衣以『てつ×ねこ』成员的身份参加『ニコラジ』（日本广播节目：Nico Radio）。\r\n\r\n个人履历\r\n　　①2006年开始以自由声优的身份活动。后来在参与同人商业的旁白配音、图书、同人游戏等等活动的同时，2007年也开始以歌手身份活动。\r\n　　②2008年1月与『Team.ねこかん[猫]』主唱nyanyannya合作动画「受かるまでは眠らない!」（不考上就不睡觉！），正式加入『てつ×ねこ』。Nico动画网上てつ×ねこ成员里标注的是JUNCA。\r\n　　③原本是电影剧本作家，因此有时也会为歌曲作词。\r\n　　④2010年10月开始播放的动画《缘之空》插曲中担任主唱，在Star Child（日本某会社）中正式出道。\r\n　　⑤在小田原市社区电台“小田原FM”的现场表演节目《ウタかた》中担任音乐解说员。\r\n　　⑥为Tomy会社（日本某玩具制造公司）发卖的《くるくるペットパーク》（咕噜咕噜转的宠物公园）演唱广告曲。除此之外虽然还演唱了很多广告歌以及为旁白配音，不过明确地注明姓名的情况很少。\r\n　　⑦为株式会社アルティ（日本某移动设备应用开发商）发售的Android、iPhone免费应用《电卓少女》（萌化的少女语音计算器）与《お知らせ少女》（通知少女）的女主角配音。",
 *   "name": "天乙准花",
 *   "img": "https://lain.bgm.tv/pic/crt/l/a5/1d/7890_prsn_RkZYG.jpg",
 *   "infobox": [
 *     {
 *       "key": "简体中文名",
 *       "value": "天乙准花"
 *     },
 *     {
 *       "key": "别名",
 *       "value": [
 *         {
 *           "v": "椎那天 = 柊真冬 = 秋山はるる = 大高あまね"
 *         },
 *         {
 *           "v": "JUNCA"
 *         },
 *         {
 *           "v": "JUNCA@てつ×ねこ"
 *         },
 *         {
 *           "k": "纯假名",
 *           "v": "あまおと じゅんか"
 *         },
 *         {
 *           "k": "罗马字",
 *           "v": "amaoto jyunka"
 *         }
 *       ]
 *     },
 *     {
 *       "key": "性别",
 *       "value": "女"
 *     },
 *     {
 *       "key": "生日",
 *       "value": "8月27日"
 *     },
 *     {
 *       "key": "血型",
 *       "value": "O型"
 *     },
 *     {
 *       "key": "blog",
 *       "value": "http://www.homesweethome.sakura.ne.jp/"
 *     }
 *   ],
 *   "career": [
 *     "artist",
 *     "seiyu"
 *   ],
 *   "stat": {
 *     "comments": 7,
 *     "collects": 74
 *   },
 *   "id": 7890,
 *   "locked": false,
 *   "type": 1
 * }
 * ```
 */
data class PersonDetail(
    val id: Int,
    val name: String,
    val type: PersonType,
    val career: List<PersonCareer>,
    val images: Images,
    val summary: String,
    val locked: Boolean,
    val last_modified: String,
    val infobox: List<Infobox>,
    val gender: String,
    val blood_type: String?,
    val birth_year: String?,
    val birth_mon: Int,
    val birth_day: Int,
    val stat: Stat,
    val img: String,
)
