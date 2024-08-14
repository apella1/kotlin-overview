package basics.classes

// declaring properties, either mutable(var) or immutable (val)

class Address {
    var name: String = "Nairobi"
    var state: String? = null
    val zip: Int = 123
}

fun copyAddress(address: Address): Address {
    val res = Address()
    res.name = address.name
    res.state = address.state

    return res
}

// getters and setters

class RectangleShape(val width: Int, val height: Int) {
    // property type is optional as it can be inferred from the getter's return type
    val area: Int get() = this.width * this.height
}
