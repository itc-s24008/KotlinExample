package jp.ac.it_college.std.s24008.kotlin.chap01

fun main() {
    var i = 1
    println("while loop")
    while (i < 5) {
        println("i is $i")
        i++
    }
    println("for loop 1")
    for (i in 1..10) {
        println("i is $i")
    }
    println("for loop 2")
    for (i in 1..10 step 2) {
        println("i is $i")
    }
    println("for loop 3")
    val list = listOf(1, 2, 5, 6, 10)
    for (i in list) {
        println("i is $i")
    }
    println("repeat loop function")
    repeat(10) {
        println("i is $it")
    }
}