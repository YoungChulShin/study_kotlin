package study.kotlin.reference.concepts.classesandobject

fun main() {
    val parent = MyPerson("parent")
    val child = MyPerson("child", parent)
}

class MyPerson(val name: String) {
    val children: MutableList<MyPerson> = mutableListOf<MyPerson>().also { println("init children") }

    init {
        println("init block")
    }

    constructor(name: String, parent: MyPerson): this(name) {
        println("second constructor init")
        parent.children.add(this)
    }
}