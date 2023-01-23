package study.kotlin.reference.concepts.type.basictypes

fun main() {

    // 묵시적인 char 선언
    val a = '1'

    // 명시적인 char 선언
    val b: Char = '2'
    println(b)

    // 특수 문자
    val c = '\t'    // tab
    println("helllo$c world")   // hello    world

    val d = '\b'    // backspace
    println("helllo${d}world")  // hellworld

    val n = '\n'    // newline
    println("hello${n}world")   // hello
                                // world

    val o = '\r'    // carriage return
    println("helloooooo${o}world")  // world

    val p = '\''    // single quotation
    println("${p}hello world${p}")  // 'hello world'

    val q = '\"'    // double quotation
    println("${q}hello world${q}")  // "hello world"

    val r = '\\'    // back slash
    println("hello${r}world")   // hello\world

    val s = '\$'    // dollar sign
    println("hello${s}world")   // hello$world

    // unicode 출력
    println('\u11A8')
    println("\u11A8\u11A8")

    // char to int
    val t = '1'
    println(t.digitToInt())

    val u = 'a'
    println(u.digitToIntOrNull())
}