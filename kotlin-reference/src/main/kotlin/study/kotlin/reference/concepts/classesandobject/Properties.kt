package study.kotlin.reference.concepts.classesandobject

import java.time.Instant
import java.time.temporal.ChronoUnit
import java.time.temporal.Temporal
import java.time.temporal.TemporalField

const val SYSTEM_DEPRECATED: String = "This system is deprecated"

fun main() {

    val myRetangle = MyRetangle(10, 5)
    println(myRetangle.area)
    println(myRetangle.stringRepresentation)
    myRetangle.stringRepresentation = "aaa"
    println(myRetangle.stringRepresentation)
    myRetangle.printtest()
}

// property 구성
// 초기 값, getter, setter
// val은 get을 볼뎌로 선언할 수 있다
// set(value)를 통해서 값을 할당하면서 로직을 추가할 수 있다
// private set을 통해서 접근 제어
// field라는 backing field를 이용해서 값을 접근할 수 있다
class MyRetangle(val width: Int, val height: Int) {
//    val area: Int
//        get() = this.width * this.height
    // getter 만 선언
    val area get() = this.width * this.height

    var stringRepresentation: String = ""
        get() = this.toString()
        set(value) {
            field = value.uppercase()
            println(value)
        }

    var setterVisibility: String = "abc"
        private set

    fun printtest() {
        println(setterVisibility)
        setterVisibility = "def"
        println(setterVisibility)
    }
}

