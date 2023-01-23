package study.kotlin.reference.concepts.type.basictypes

fun main() {
    // 배열 생성
    // - 객체 타입으로 만들어진다
    /**
     * 배열 생성
     * - arrayOf
     * - arrayOfNulls
     * - constructor
     */

    val a = arrayOf(1, 2, 3)
    println(a)
    println(a.size)

    val b = arrayOfNulls<Int>(3)
    println(b.size)

    val c = Array(5) { i -> (i * i).toString() }
    println(c.size)
    c.forEach { print(it) }
    println()

    // Primitive Type
    // IntArray, ByteArray, ShortArray
    val e: IntArray = intArrayOf(1, 2, 3)
    e[0] = e[1] + e[2]
    println(e[0])

    val f: ShortArray = shortArrayOf(1, 2, 3)

}