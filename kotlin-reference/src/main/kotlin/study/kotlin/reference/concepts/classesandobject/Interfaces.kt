package study.kotlin.reference.concepts.classesandobject

// 추상 메서드 처럼 함수의 형태만 저장할 수도 있고
// 구현체를 가질 수도 있다
// 다른점은 상태 값을 저장할 수는 없다
// property를 선언할 수 있지만 선언 또는 getter만 구현할 수 있다
interface MyInterface {
    val prop: Int
    fun bar()
    fun foo() {
        println("foo - $prop")
    }
}

class MyChild: MyInterface {

    override val prop: Int
        get() = TODO("Not yet implemented")

    override fun bar() {
        println("mychild bar")
    }

}

fun main() {
    val myChild: MyInterface = MyChild()
    myChild.foo()
}