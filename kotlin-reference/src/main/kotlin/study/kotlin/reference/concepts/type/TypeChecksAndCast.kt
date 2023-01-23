package study.kotlin.reference.concepts.type

fun main() {

    // is operator
    // can conform to a given types
    val a = "a"
    if (a is String) {
        print(a.length)
    }
    println()

    // smart cast
    demo2(3)
    demo2("aa")
    demo2(intArrayOf(1, 2, 3))

    // unsafe cast
    // as keyword 사용
    // type이 맞지 않으면 ClassCastException 발생
    // null이라면 NullPointerException 발생
    // null일 경우 nullable 타입으로 받아서 변환되는 것은 가능하다
    val y = intArrayOf(1, 2, 3)
    // val x: String = y as String // class cast exception
    val y2 = null
    val z: String? = y2 as String?
    println(z)

    // safe cast
    // as? keyword 사용. 실패시 null리턴
    val b = null
    val c: String? = b as? String
}

fun demo(x: Any) {
    if (x is String) {
        // x를 String으로 변환하지 않아도 컴파일러가 String으로 판단한다
        println(x.length)
    }
}

fun demo2(x: Any) {
    when(x) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> print(x.sum())
    }
}