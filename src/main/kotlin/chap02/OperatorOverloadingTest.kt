package chap02

data class Num(val value: Int) {
    operator fun plus(other: Num): Num = Num(value + other.value)
    operator fun times(other: Num): Num = Num(value * other.value)
    operator fun minus(other: Num): Num = Num(value - other.value)
    operator fun div(other: Num): Num = Num(value / other.value)
}

fun main() {
    val num5 = Num(5)
    val num1 = Num(1)

    val sun = num5 + num1
    println(sun)
    val sub = num5 - num1
    println(sub)

//    val greeterThen = num5 > num1
//    val lessThan = num5
}