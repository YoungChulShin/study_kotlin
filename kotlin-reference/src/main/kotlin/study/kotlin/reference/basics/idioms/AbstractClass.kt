package study.kotlin.reference.basics.idioms

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
    fun greeting() {
        println("hi")
    }
}

class MyClass: MyAbstractClass() {
    override fun doSomething() {
        println("lalala")
    }

    override fun sleep() {
        println("zzzz")
    }
}

fun main() {
    val myClass = MyClass()

    myClass.doSomething()
    myClass.sleep()
    myClass.greeting()

    val myInstantObject = object : MyAbstractClass() {
        override fun doSomething() {
            println("lalala2")
        }

        override fun sleep() {
            println("zzzz2")
        }
    }

    myInstantObject.doSomething()
}