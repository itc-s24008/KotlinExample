package chap02

class User6 {
    val id: Int = 1
    val name = "Kotlin"
}

fun main() {
    val userA = User6()
    val userB = User6()

    println(userA)
    println(userB)

    println(userA.hashCode())
    println(userB.hashCode())

    println(userA == userB)
}