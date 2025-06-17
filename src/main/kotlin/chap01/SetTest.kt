package jp.ac.it_college.std.s24008.kotlin.chap01

fun main() {
    val set = setOf("one", "two", "three")
    println(set)
    println("three" in set)
    println("four" in set)

    val mutableSet = mutableSetOf("one", "two", "three")
    mutableSet.add("four")
    println(set)
    mutableSet.add("two")
    println(mutableSet)
}