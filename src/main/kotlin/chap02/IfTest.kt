package chap02

fun main() {
    printOddOrEvenNumberText(100)
    printOddOrEvenNumberText(99)
    printOddOrEvenNumberText2(100)
    printOddOrEvenNumberText2(101)
}

// Kotlin 的にはダサい実装方法
fun printOddOrEvenNumberText(num: Int) {
    var text = ""
    if (num % 2 == 1) {
        text = "奇数"
    } else {
        text = "偶数"
    }
    println(text)
}

// Kotlin らしい実装方法
fun printOddOrEvenNumberText2(num: Int) {
    val text = if (num % 2 == 1) "奇数" else "偶数"
    println(text)
}

fun getOddOrEvenNumberText(num: Int): String {
    return if (num % 2 == 1) {
        "奇数"
    } else {
        "偶数"
    }
}

fun getOddOrEvenNumberText2(num: Int): String = if (num % 2 == 1) "奇数" else "偶数"