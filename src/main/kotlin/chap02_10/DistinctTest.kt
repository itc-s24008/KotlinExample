package chap02_10

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val distinctList = list.distinct()
    distinctList.forEach { println(it) }
}