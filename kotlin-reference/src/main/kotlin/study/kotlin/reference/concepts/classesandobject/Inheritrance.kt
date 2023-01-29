package study.kotlin.reference.concepts.classesandobject

fun main() {

    // java의 모든 클래스가 object의 하위인 것처럼, kotlin은 Any의 하위 객체이다
    // - toString, equals, hashcode를 구현한다


    val circle = Circle()
    circle.draw()

    val myCircle = MyCircle()
    myCircle.draw()
}

// 상속을 위해서는 open을 붙여준다
open class Base(p: Int) {}

class Derived(p: Int) : Base(p) {

}

// 기본 생성자가 없다면 다른 생성자에서는 super를 호출해준다
class MyDerive: Base {

    constructor(p: Int): super(p)

    constructor(p: Int, q: String): super(p)
}

// 메서드를 open으로 하면 자식 클래스에서 재정의할 수 있다

open class Shape {
    open fun draw() {
        println("draw shape")
    }
    fun fill() {
        println("fill shape")
    }
}

// 자식 클래스에서 open 메서드를 재정의 이후에 final 로 선언하면, 다른 클래스가 이 클래스를 상속할 때 오버라이드 할 수 없다
open class Circle: Shape() {
    final override fun draw() {
        println("draw circle")
    }
}

class MyCircle: Circle() {
//    override fun draw() {
//        println("draw myCircle")
//    }
}