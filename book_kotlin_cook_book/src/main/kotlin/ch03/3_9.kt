package ch03

import kotlin.random.Random

fun doNothing(): Nothing = throw Exception("Nothing")

fun main() {
    val x = null

    val y = if (Random.nextBoolean()) "true" else throw Exception("nope")
}