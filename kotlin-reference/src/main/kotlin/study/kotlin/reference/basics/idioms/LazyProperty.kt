package study.kotlin.reference.basics.idioms

import java.time.Instant

fun main() {

    val p: String by lazy {
        Instant.now().toString()
    }

    println(Instant.now().toString())
    Thread.sleep(1000)

    println(p)

    Thread.sleep(1000)

    println(p)
}