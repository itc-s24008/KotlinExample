package jp.ac.it_college.std.s24008.kotlin.chap01

import kotlin.random.Random

fun main() {
    ifExample(Random.nextInt(98, 103))
    ifExample(Random.nextInt(98, 103))
    ifExample(Random.nextInt(98, 103))
}

fun ifExample(num: Int) {
    if (num < 100) {
        println("Less than 100")
    } else if (num == 100) {
        println("num is 100")
    }else {
        println("Greater than 100")
    }
}