package jp.ac.it_college.std.s24008.kotlin.chap01

import kotlin.random.Random

fun main() {
    val colors = listOf(
        "red",
        "green",
        "blue",
    )
    val randomSelect = Random.nextInt(colors.size)
    val message = when
}