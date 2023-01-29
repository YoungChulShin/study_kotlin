package study.kotlin.reference.concepts.classesandobject

open class MyBase(val name: String) {

    init {
        println("base class initialize")
    }

    open val size: Int = name.length.also { println("Initialize size in the base class") }
}

class MyDerived(
    name: String,
    val lastname: String,
): MyBase(name.replaceFirstChar { it.uppercase() }.also { println("Arggument for the base class") }) {

    init { println("Initializing a derived class") }

    override val size: Int = (super.size + lastname.length).also { println("Initializing size in the drived class") }
}

fun main() {
    val myBase1 = MyBase("hi")
    println("============")
    val myDrived1 = MyDerived("hello", "world")
    // Arggument for the base class"
    // base class initialize
    // Initialize size in the base class
    // Initializing a derived class
    // Initializing size in the drived class
}