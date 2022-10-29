package basic

//https://kotlinlang.org/docs/operator-overloading.html#increments-and-decrements
enum class OrderStatus {
    CREATED, SUBMITTED, PICKEDUP, DELIVERRED;

    companion object {
        // 메서드 직접 구현
        fun of(value: String) = OrderStatus.valueOf(value.uppercase())

        // Operator 메서드 사용
        operator fun invoke(value: String) = OrderStatus.valueOf(value.uppercase())
    }
}

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

data class Counter(val index: Int) {

    operator fun plus(value: Int) = Counter(index + value)
}

fun main() {
    // 직접 구현 메서드 호출
    println(OrderStatus.of("created"))
    // Operator 메서드의 invoke 표현식 호출
    println(OrderStatus("created"))
    // Operator 메서드의 invoke 메서드 호출
    println(OrderStatus.invoke("created"))

    val point = Point(10, 20)
    println(-point)
    println(point.unaryMinus())

    val counter = Counter(1000)
    println(counter + 10)

}