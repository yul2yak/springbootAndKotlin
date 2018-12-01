package main.kotlin.htmlBuilder

import kotlin.math.max

enum class PrimaryStat {
    STRENGTH, AGILITY, INTELLECT
}
enum class Team {
    SCOURGE, SENTINEL
}
enum class Champion(val team: Team, val type: PrimaryStat) {
    /* 나엘 */
    챈(Team.SENTINEL, PrimaryStat.STRENGTH),
    스톤콜드(Team.SENTINEL, PrimaryStat.STRENGTH),
    무라딘(Team.SENTINEL, PrimaryStat.STRENGTH),
    캐런후프(Team.SENTINEL, PrimaryStat.STRENGTH),
    아다스(Team.SENTINEL, PrimaryStat.STRENGTH),
    탈론(Team.SENTINEL, PrimaryStat.STRENGTH),
    갈리토스(Team.SENTINEL, PrimaryStat.STRENGTH),
    니피(Team.SENTINEL, PrimaryStat.STRENGTH),
    세드릭(Team.SENTINEL, PrimaryStat.STRENGTH),
    그리메(Team.SENTINEL, PrimaryStat.STRENGTH),
    파르테논(Team.SENTINEL, PrimaryStat.STRENGTH),
    우서(Team.SENTINEL, PrimaryStat.STRENGTH),
    참새(Team.SENTINEL, PrimaryStat.AGILITY),
    다래(Team.SENTINEL, PrimaryStat.AGILITY),
    아가멤논(Team.SENTINEL, PrimaryStat.AGILITY),
    적혈귀(Team.SENTINEL, PrimaryStat.AGILITY),
    나이샤(Team.SENTINEL, PrimaryStat.AGILITY),
    마젠다(Team.SENTINEL, PrimaryStat.AGILITY),
    실크(Team.SENTINEL, PrimaryStat.AGILITY),
    제르딘(Team.SENTINEL, PrimaryStat.AGILITY),
    티란데(Team.SENTINEL, PrimaryStat.AGILITY),
    가래(Team.SENTINEL, PrimaryStat.AGILITY),
    샤카잔(Team.SENTINEL, PrimaryStat.AGILITY),
    나래(Team.SENTINEL, PrimaryStat.AGILITY),
    이레아(Team.SENTINEL, PrimaryStat.INTELLECT),
    로칸(Team.SENTINEL, PrimaryStat.INTELLECT),
    프로도(Team.SENTINEL, PrimaryStat.INTELLECT),
    퓨리온(Team.SENTINEL, PrimaryStat.INTELLECT),
    자이로스(Team.SENTINEL, PrimaryStat.INTELLECT),
    엘딘(Team.SENTINEL, PrimaryStat.INTELLECT),
    나즈그렐(Team.SENTINEL, PrimaryStat.INTELLECT),
    페르다(Team.SENTINEL, PrimaryStat.INTELLECT),
    멜쉬드(Team.SENTINEL, PrimaryStat.INTELLECT),
    마누트(Team.SENTINEL, PrimaryStat.INTELLECT),
    볼진(Team.SENTINEL, PrimaryStat.INTELLECT),
    /* 언데드 */
    세티어(Team.SENTINEL, PrimaryStat.STRENGTH),
    칸젤(Team.SENTINEL, PrimaryStat.STRENGTH),
    구르르(Team.SENTINEL, PrimaryStat.STRENGTH),
    브로켄백작(Team.SENTINEL, PrimaryStat.STRENGTH),
    에얼리언(Team.SENTINEL, PrimaryStat.STRENGTH),
    뮤턴트(Team.SENTINEL, PrimaryStat.STRENGTH),
    멀머던(Team.SENTINEL, PrimaryStat.STRENGTH),
    그롬헬스크림(Team.SENTINEL, PrimaryStat.STRENGTH),
    킹죠(Team.SENTINEL, PrimaryStat.STRENGTH),
    스벤(Team.SENTINEL, PrimaryStat.STRENGTH),
    도살자(Team.SENTINEL, PrimaryStat.STRENGTH),
    카르투스(Team.SENTINEL, PrimaryStat.STRENGTH),
    아그니(Team.SENTINEL, PrimaryStat.AGILITY),
    바이퍼(Team.SENTINEL, PrimaryStat.AGILITY),
    레퍼드(Team.SENTINEL, PrimaryStat.AGILITY),
    일리단(Team.SENTINEL, PrimaryStat.AGILITY),
    레이든(Team.SENTINEL, PrimaryStat.AGILITY),
    아카샤(Team.SENTINEL, PrimaryStat.AGILITY),
    레오닉(Team.SENTINEL, PrimaryStat.AGILITY),
    실바나스(Team.SENTINEL, PrimaryStat.AGILITY),
    리키안(Team.SENTINEL, PrimaryStat.AGILITY),
    로자미어(Team.SENTINEL, PrimaryStat.AGILITY),
    아크루라(Team.SENTINEL, PrimaryStat.AGILITY),
    줄마란(Team.SENTINEL, PrimaryStat.AGILITY),
    니바스(Team.SENTINEL, PrimaryStat.INTELLECT),
    레이디데스(Team.SENTINEL, PrimaryStat.INTELLECT),
    루시퍼(Team.SENTINEL, PrimaryStat.INTELLECT),
    메두사(Team.SENTINEL, PrimaryStat.INTELLECT),
    오블리(Team.SENTINEL, PrimaryStat.INTELLECT),
    켈자드(Team.SENTINEL, PrimaryStat.INTELLECT),
    아키로(Team.SENTINEL, PrimaryStat.INTELLECT),
    악동(Team.SENTINEL, PrimaryStat.INTELLECT),
    플루토(Team.SENTINEL, PrimaryStat.INTELLECT),
    나카챠(Team.SENTINEL, PrimaryStat.INTELLECT),
    칼리나스(Team.SENTINEL, PrimaryStat.INTELLECT),
}
enum class Result {
    승, 패, 무
}
data class User(val id: String, val name: String, val battles: Int = 0, val wins: Int = 0)
data class Record(val date: String, val id: Int, val team: Team, val player: User,
                  val champion: Champion, val kill: Int = 0, val death: Int = 0,
                  val assist: Int = 0, val level: Int = 1, val result: Result = Result.무)
data class Game(val data: ArrayList<Record>) {
    val date: String
        get() = data[0].date
    val id: Int
        get() = data[0].id
    val scourge: List<Record>
        get() = data.filter { it.team == Team.SCOURGE }
    val sentinel: List<Record>
        get() = data.filter { it.team == Team.SENTINEL }
    val maxNumberOfPlayers: Int
        get() = max(scourge.size, sentinel.size)

}

val muno = User("muno43", "김문호")
val changwoo = User("blu", "장창우")
val namdo = User("namzzok", "구남도")
val jaekwon = User("ghdwornjs", "홍재권")
val yoongyu = User("nanun015", "김윤규")
val seongyul = User("yul2ya", "김성율")
val users = arrayListOf<User>( muno, changwoo, namdo, jaekwon, yoongyu, seongyul)

fun getGames() = listOf<Game>(
        Game(
                arrayListOf(
                        Record("20181101", 1, Team.SCOURGE, muno, Champion.스벤, result=Result.승),
                        Record("20181101", 1, Team.SCOURGE, changwoo, Champion.나즈그렐, result=Result.승),
                        Record("20181101", 1, Team.SENTINEL, namdo, Champion.실크, result=Result.패),
                        Record("20181101", 1, Team.SENTINEL, jaekwon, Champion.갈리토스, result=Result.패)
                )
        ))
