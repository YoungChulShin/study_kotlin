package ch02

import java.text.NumberFormat

@JvmOverloads
fun addProduct(name: String, price: Double = 0.0, desc: String? = null) =
    "Adding product with $name, ${desc ?: "None"}, and " + NumberFormat.getCurrencyInstance().format(price)

fun main() {
    println(addProduct("Name", 5.5, "Desc"))
    println(addProduct("Name", 5.5))
    println(addProduct("Name"))
}