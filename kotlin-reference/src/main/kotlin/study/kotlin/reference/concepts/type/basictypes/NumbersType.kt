package study.kotlin.reference.concepts.type.basictypes

fun main() {
    // 정수

    // 명시적인 선언
    val a: Byte = 1         // 1byte
    val b: Short = 2        // 2byte
    val c: Int = 3          // 4byte
    val d: Long = 12345     // 8 byte

    // 명시적으로 타입을 지정하지 않으면 Int, Long 중에 하나가 정해진다
    val e = 12345
    val f = 1111111111111111111
    val g = 12345L

    // 실수

    // 명시적인 선언
    // float는 f를 붙여준다
    val pi: Float = 3.14f       // 4byte
    val pi2: Double = 3.14      // 8byte

    // wideing이 적용되지 않는다
    val h: Byte = 1
    // printInt(h) // 컴파일 에러

    // 리터럴 상수
    val i = 123         // decimal
    val j = 123L        // Long
    val k = 0x0F        // hexadecimal, int type
    val l = 0b00001011  // binaries, int type
    val m = 123.4f      // f, F for float

    // _를 이용해서 좀 더 가독성 있게 할 수 있다
    val cardNumber = 1234_5678_9012L

    // JVM에서는 primitive type으로 저장된다. (int, double)
    // nullable type(Int?) 또는 Generic은 박싱된다. (Integer, Double)

    // 명시적인 타입 변환
    // 작은 타입은 큰 타입의 서브 타입이 아니다
    val a1: Int = 1
    // val a2: Long? = a1   // 이 코드는 에러. type mismatch

    // 명시적인 변환
    val a2: Long = a1.toLong()

}

fun printInt(value: Int) = println(value)