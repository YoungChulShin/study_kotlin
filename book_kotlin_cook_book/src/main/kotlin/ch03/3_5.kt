package ch03

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

// 코틀린에서는 +, -, * 같은 연산이 plus, minus, times 같은 개념으로 적용된다
// 다른 연산에 해당 연산을 추가해서 사용할 수다

fun main() {
    val point = Point(10, 20)
    println(point)
    println(-point)
    println(point)
}