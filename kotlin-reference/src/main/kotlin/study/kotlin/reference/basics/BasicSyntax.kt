package study.kotlin.reference.basics

val PI = 3.14

fun main() {

    // variables
    val c: Int? = null
    println(c)

    printLine()

    // for loop
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    printLine()

    for (index in items.indices) {
        println("$index is ${items[index]}")
    }

    println()

    // when expression
    println(describe(3L))
    println(describe(44))

    printLine()

    // ranges
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    // 0, 1, 2
    if (list.size !in list.indices) {
        println("is not range")
    }

    for (x in 1..10 step 2) {
        print("$x->")
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print("$x->")
    }
    println()

    printLine()

    // Collectionsㅎ
    val fruits = listOf("apple", "banana", "kiwi")



}

fun describe(obj: Any) =
    when (obj) {
        1           -> "One"
        "Hello"     -> "hi"
        is Long     -> "Long"
        !is String  -> "Not a string"
        else        -> "Unknown"
    }

private fun printLine() = println("====================")