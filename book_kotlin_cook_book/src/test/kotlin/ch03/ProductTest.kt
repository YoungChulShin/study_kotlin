package ch03

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ProductTest {

    @Test
    fun `check equivalence`() {
        val p1 = Product(name = "baseball", price = 10.0)
        val p2 = Product(name = "baseball", price = 10.0, onSale = false)

        assertEquals(p1, p2)
        assertEquals(p1.hashCode(), p2.hashCode())
    }

    @Test
    fun `create set to check equals and hashcode`() {
        val p1 = Product("baseball", 10.0)
        val p2 = Product(price = 10.0, onSale = false, name = "baseball")

        val products = setOf(p1, p2)
        assertEquals(1, products.size)
    }

    @Test
    fun `change price using copy`() {
        val p1 = Product("baseball", 10.0)
        val p2 = p1.copy(price = 12.0)

        assertAll(
            { assertEquals("baseball", p2.name) },
            { assertFalse(p2.onSale) },
        )
    }

    @Test
    fun `data copy function is shallow`() {
        val item1 = OrderItem(Product("baseball", 10.0), 5)
        val item2 = item1.copy()

        assertAll(
            { assertTrue(item1 == item2) },
            // 서로 다른 객체가 만들어지게 되므로 Reference 는 다르다
            { assertFalse(item1 === item2) },
            // 얉은 복사를 하기 때문에 Product는 같게 만들어진다
            // Product객체를 그대로 사용하기 때문에
            { assertTrue(item1.product == item2.product) },
            { assertTrue(item1.product === item2.product) },
        )
    }

    @Test
    fun `destructure using component functions`() {
        val p = Product("baseball", 10.0)

        val (name, price, onSale) = p

        println(name)
        println(price)
        println(onSale)
    }
}