package basics.classes

fun main() {
    compareUsers()
}

// primarily used to hold data
// compiler generates additional member functions that allows printing an instance to readable output
// data classes can't be open, abstract, sealed or inner
data class User(val name: String, val age: Int) {
    // excluding a property from the generated implementations
    var email: String = ""
}

fun compareUsers() {
    val john = User("John", 20)
    val otherJohn = User("John", 20)
    john.email = "john@gmail.com"
    otherJohn.email = "otherjohn@gmail.com"

    println("John == john: ${john == otherJohn}")
}