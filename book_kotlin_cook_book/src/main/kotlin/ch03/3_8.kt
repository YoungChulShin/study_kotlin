package ch03

fun main() {
    val processors = Runtime.getRuntime().availableProcessors()
    println(processors)

    MySingleton.myProperty
    MySingleton.myEditableProperty = 4

    MySingleton.myFunction()
}

object MySingleton {
    val myProperty = 3
    var myEditableProperty = 4

    fun myFunction() = "hi"
}