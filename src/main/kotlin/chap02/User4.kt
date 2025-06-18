package chap02

class User4 {
    lateinit var name: String
    val isValidName: Boolean
        get() = name != ""
}

fun main() {
    val user = User4()
    user.name = "なかそね"
    println(user.isValidName)
    user.name = ""
    println(user.isValidName)
}