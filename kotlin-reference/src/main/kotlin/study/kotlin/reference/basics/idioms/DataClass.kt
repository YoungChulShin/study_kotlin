package study.kotlin.reference.basics.idioms

fun main() {

    // data class
    val customer = Customer("shin", "test@test.com")
    val customer2 = Customer("shin", "test@test.com")

    // getter
    // toString
    println(customer.toString())

    // equals
    println(customer === customer2)
    println(customer == customer2)
    // hashcode
    // copy
    // component n
    println("${customer.component1()} : ${customer.component2()}")
}


data class Customer(val name: String, val email: String)