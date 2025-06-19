package chap02_10

data class User(val id: Int, val groupId: Int, val name: String)

fun main() {
    val list = listOf(1, 2, 3)
    val idList = list.map { it * 10 }
    idList.forEach { println(it) }

    println("convert")

    val userList = listOf(
        User(1, 100, "Kotlin"),
        User(2, 100, "Java")
    )

    // ユーザーの名前だけ取り出して表示する例
    userList.map { it.name }.forEach { println(it) }
}
