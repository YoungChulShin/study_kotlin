package study.kotlin.reference.concepts.type.basictypes

@ExperimentalUnsignedTypes
fun main() {

    // 선언
    val a: UInt = 1u    // u접미사 사용
    val b = 2u
    val c = 1111111111111111u
    val d = 3UL

    // unsigned array
    // 아직 불완전 하기 때문에 변경이 발생할 수 있다
    val e = ubyteArrayOf(1u, 2u, 3u)
}