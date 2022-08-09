package ch03

class Customer(val name: String) {

    private var _messages: List<String>? = null

    val messages: List<String>
        get() {
            if (_messages == null) {
                _messages = loadMessages()
            }

            return _messages!!
        }

    private fun loadMessages(): MutableList<String> =
        mutableListOf("A","B","C")
            .also { println("message loaded")}
}

class CustomerLazy(val name: String) {
    val messages: List<String> by lazy { loadMessages() }

    private fun loadMessages(): MutableList<String> =
        mutableListOf("A","B","C")
            .also { println("message loaded")}
}

fun main() {
    val customer = Customer("shin").apply { messages }
    println("=====")
    println(customer.messages.size)
    println(customer.messages.size)
    println("=====")

    val customerLazy = CustomerLazy("shin").apply { messages }
    println("=====")
    println(customerLazy.messages.size)
    println(customerLazy.messages.size)
}