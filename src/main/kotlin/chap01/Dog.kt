package jp.ac.it_college.std.s24008.kotlin.chap01

import jp.ac.it_college.std.s24008.kotlin.chap01.Animal

class Dog(name: String) : Animal(name) {
    override fun cries() = println("bowwow")
}

fun main() {
    val dog = Dog("Kotlin")
    dog.showName()
    dog.cries()
}