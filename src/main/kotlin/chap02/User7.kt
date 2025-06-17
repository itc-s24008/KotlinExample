package chap02

data class User7(
    val id: Int = 1,
    val name: String = "Kotlin",
)


fun main() {
    val userA = User7()
    val userB = User7()

    println(userA)
    println(userB)

    println(userA.hashCode())
    println(userB.hashCode())

    println(userA == userB)
}