package ch05

import java.util.LinkedList

fun main() {

    var numList = listOf(1, 2, 4, 5, 6)
    var numSet = setOf(1, 3, 1, 3, 5)
    println(numSet.size)
    var map = mapOf(1 to "one", 2 to "two", 3 to "three")

    var numList2 = mutableListOf(1, 2, 3, 4, 5)
    numList2.add(5, 3)
    println(numList2)

    var numSet2 = mutableSetOf(1, 2, 3, 1, 2, 3, 5)
    println(numSet2)

    val list = LinkedList<Int>()
    list.add(4)
}