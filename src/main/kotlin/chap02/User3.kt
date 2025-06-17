package chap02

class User3 {
    var age: Int = 0
    lateinit var name: String
}

class BadUser3 {
    var age: Int = 0
    var name: String = "なかそね"
}



fun main() {
    val user = User3()
    user.name = "Nakasone"
    println(user.name)
    val badUser = User3()
    println(badUser.name)
}