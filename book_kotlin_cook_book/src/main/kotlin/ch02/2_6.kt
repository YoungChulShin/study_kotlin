package ch02

import kotlin.math.pow

fun Int.pow(x: Int) = toDouble().pow(x).toInt()
fun Long.pow(x: Int) = toDouble().pow(x).toLong()

infix fun Int.`^`(x: Int) = toDouble().pow(x).toInt()

fun main() {
    println(2 `^` 2)
}