package chap02

class User2(val id: Int) {
    var name: String = ""
}

fun main() {
    val user = User2(1)
    user.name = "なかそね"
}