package study.kotlin.reference.concepts.controlflow

fun main() {

    // break
    for (i in 1..100) {
        for (j in 1..100) {
            if (j == 10) {
                println("$i, $j")
                break
            }
        }
    }

    println("=========================")

    // break - with label
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 10) {
                println("$i, $j")
                break@loop
            }
        }
    }

    println("=========================")
    foo()   // foreach + return
}

fun foo() {
    listOf(1,2,3,4,5).forEach {
        if (it == 3) return
        print(it)
    }
    println("this point is unreachable")
}