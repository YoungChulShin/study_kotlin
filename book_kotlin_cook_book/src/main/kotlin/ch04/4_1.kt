package ch04

fun sum(vararg nums: Int) = nums.fold(0) { acc, n -> acc + n }

fun main() {
    val numbers = intArrayOf(3, 1, 4, 5, 9)
    numbers[0] = 4;

    println(numbers[0])
}