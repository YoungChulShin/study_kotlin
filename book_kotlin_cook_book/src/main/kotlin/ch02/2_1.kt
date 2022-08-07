package ch02

class Person(
    val first: String,
    val middle: String?,
    val last: String,
)

fun main() {

    // not null
    var name: String
    name = "YCShin"

    val name1 = Person("Youngchul", null, "Shin")
    val name2 = Person("Minjeong", null, "Min")

    // name2와 middle이 val 이기 때문에 가능하다
    if (name2.middle != null) {
        val middleNameLength = name2.middle.length
    }

    // 단언 연산자 사용
    var name3 = Person("Minjeong", null, "Min")
    if (name3.middle != null) {
        val middleNameLength = name3.middle!!.length
    }

    // 안전 연산자 ? 사용
    // null 을 리턴한다
    // java 에서는 3항 연산자로 처리된다 Integer middleNameLength2 = var10000 != null ? var10000.length() : null;
    val middleNameLength2 = name3.middle?.length
    println(middleNameLength2)

    // 엘비스 연산자
    // java 에서는 3항 연산자로 처리된다 Integer middleNameLength2 = var10000 != null ? var10000.length() : 0;
    val middleNameLength3 = name3.middle?.length ?: 0
    println(middleNameLength3)


    val p1 = 1
    val p2 = 1.0
    val p3 = p2 as? Int ?: "nullstring"
    println(p3)
}