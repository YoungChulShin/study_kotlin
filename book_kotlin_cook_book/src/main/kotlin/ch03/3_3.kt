package ch03

data class Product(
    val name: String,
    var price: Double,
    var onSale: Boolean = false
)

// toString
// equals
// hashcode
// conponentN
data class OrderItem(val product: Product, val quantity: Int)

fun main() {

    val p = Product("baseball", 10.0)

//    String var1 = p.component1();
//    double var2 = p.component2();
//    boolean onSale = p.component3();
    val (name, price, onSale) = p

    println(name)
}