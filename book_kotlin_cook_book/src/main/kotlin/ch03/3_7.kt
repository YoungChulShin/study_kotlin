package ch03

class Customer37(val name: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        val otherCustomer = (other as? Customer37) ?: return false
        return this.name == otherCustomer.name
    }

    override fun hashCode() = name.hashCode()
}