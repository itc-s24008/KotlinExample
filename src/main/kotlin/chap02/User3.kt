package chap02

class User3() {
    var age: Int = 0
    lateinit var name: String
}

class BadUser3 {
    var age: Int = 0
    var name: String = ""
}

class BadBadUser3 {
    var name: String? = null
}

fun main() {
    val user = User3()
    user.name = "なかそね"
    println(user.name)
    val badUser = BadUser3()
    println(badUser.name)
}