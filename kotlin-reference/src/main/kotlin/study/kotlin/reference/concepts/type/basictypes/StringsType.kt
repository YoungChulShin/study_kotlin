package study.kotlin.reference.concepts.type.basictypes

fun main() {
    // 문자열의 chaacter 접근
    val a = "hello world"
    val b = a[0]
    val c = a.get(0)
    if (b == c) {
        println("b c equals")
    }

    // for loop
    val d = "hello world"
    for (c in d) {
        print(c)
    }
    println()

    // string immutable
    val e = "abcd"
    println(e.uppercase())
    println(e)

    // 문자열을 더할 때는 '+'를 사용한다
    // 첫번째 항목이 문자라면 뒤에 다른 타입이와도 연산 가능하다
    val f = "abc" + 1
    println(f + "def")

    // String Literal
    // escape string
    val g = "Hello world!\n"
    println(g)

    // raw string
    val h = """
        for (c in "foo")
            print(c)  
    """.trimIndent()
    println(h)

    // string tempate
    val price = """
        ${'$'}_9.99
    """.trimIndent()
    println(price)
}