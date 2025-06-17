package chap02

fun main() {
    printOddOrEvenNumberText(100)
    printOddOrEvenNumberText(99)
}

// 偶数か奇数かを判定して出力する関数
fun printOddOrEvenNumberText(value: Int) {
    val text = getOddOrEvenNumberText(value)
    println(text)
}

fun getOddOrEvenNumberText(num: Int): String {
    return if (num % 2 == 0) {
        "even"
    } else {
        "偶数"
    }

    fun getOddOrEvenNumberText() = if (num % 2 == 0) "even" else "odd"
}