package study.kotlin.reference.concepts.controlflow

fun main() {

    // throw Exception
    // throw Exception("test")

    // try expression
    val a = try {
        "a".toInt()
    } catch (e: Exception) {
        -1
    }
    println(a)

    // checked exception이 없다
    // throw를 명시하고 싶다면 주석에서 @Throws를 사용하자

    // nothing type
    // 응답을 하지 않는다는 것을 명시할 때 사용

    // 값에 null을 지정하면 Nothing? 타입이 된다
    val b = null


}

fun throwException(): Nothing {
    throw Exception("test")
}