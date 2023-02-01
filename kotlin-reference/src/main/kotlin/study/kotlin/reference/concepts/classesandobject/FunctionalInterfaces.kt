package study.kotlin.reference.concepts.classesandobject

// functional interface 정의
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

fun main() {
    // 익명함수 구현
    val isEvent = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }

    // 람다식 구현
    val isEvent2 = IntPredicate { it % 2 == 0 }

    println("익명함수: ${isEvent.accept(2)}")
    println("람다식: ${isEvent2.accept(2)}")
}