package ch02

import kotlin.math.pow

fun Int.pow(x: Int) = toDouble().pow(x).toInt()
fun Long.pow(x: Int) = toDouble().pow(x).toLong()

infix fun Int.`^`(x: Int) = toDouble().pow(x).toInt()

infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

fun main() {
    println(2 `^` 2)

    val pair = "a" to 1
    println(pair)
    val pair2 = "b" to 2
    val pair3 = Pair("c", 3)
    mapOf(pair)
}