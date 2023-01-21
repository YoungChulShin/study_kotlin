package study.kotlin.reference.basics.idioms

fun main() {

    // extension functions
    val name = "shinyc"
    name.sayHi()

    println(Resource.name)

    // swap values
    var a = 1
    var b = 2
    a = b.also { b = a }
    println(a)
    println(b)
}

fun String.sayHi() {
    println("hi, $this")
}

object Resource {
    val name = "Name"
}