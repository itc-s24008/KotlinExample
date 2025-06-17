package chap02

class User1 {
    var name: String = ""
}

fun main() {
    val user = User1()
    user.name = "Nakasone"
    println(user.name)
}