package study.kotlin.reference.concepts.controlflow

import kotlin.random.Random

fun main() {
    ////////////////////////////////////////////////
    // if expression
    ////////////////////////////////////////////////
    val a = 1
    val b = 2
    val max = if (a > b) a else b
    println(max)

    // branch가 있다면 마지막 값이 return 문이다
    val max2 = if (a > b) {
        println("a")
        a
    } else {
        println("b")
        b
    }

    // when expression

    // 기본적으로 표현식으로 쓰일 때는 else가 필수이지만, 그 값을 모두 알 수 있는 경우라면 else가 필요 없다
    // - enum, sealed class
    val myBit = when(getRandomBit()) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
    }
    println(myBit)

    // when multi condition
    val c = Random.nextInt(0, 10)
    when(c) {
        in 0..5 -> println("0..5")
        in 6 until 10 -> println("6 until 10")
        else -> println("else")
    }

    // when check type
    val d: Any = 1
    when(d) {
        is String -> println("String")
        is Int -> println("Int")
    }

    val result = when (val response = getRandomBit2()) {
        is String -> {
            println("string")
            1
        }
        is Bit -> {
            println("bit")
            2
        }
        else -> {
            println("else")
            3
        }
    }
    println(result)

    ////////////////////////////////////////////////
    // for loops
    ////////////////////////////////////////////////
    val e = listOf(1, 2, 3, 4, 5)
    for (item in e) {
        print(item)
    }
    println()


    val f = intArrayOf(1, 2, 3, 4, 5)
    for (index in f.indices) {
        print(f[index])
    }
    println()

    for ((index, value) in f.withIndex()) {
        println("$index: $value")
    }



}

enum class Bit(val value: Int) {
    ZERO(0),
    ONE(1);
}

private fun getRandomBit(): Bit {
    val randomInt = Random.nextInt(0, 2)
    return Bit.values().asList().filter { bit -> bit.value ==  randomInt}.first()
}

private fun getRandomBit2(): Any {
    val randomInt = Random.nextInt(0, 2)
    return Bit.values().asList().filter { bit -> bit.value ==  randomInt}.first()
}