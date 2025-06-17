package jp.ac.it_college.std.s24008.kotlin.chap01

fun main() {
    val length = countLength("サーバーサイドKotlin")
    displayMessage("サーバーサイドKotlin : $length")
}

fun displayMessage(message: String) {
    println(message)
}

fun countLength(str: String): Int = str.length