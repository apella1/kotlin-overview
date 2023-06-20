package basics

fun main() {
    val count: Int = 32
    val name: String = "Piotr"
    val attribute = "Strong"
    println(name + attribute)
    val temperature = 43.43
    var age = 43
    age = 20
    age++
    var hasArrived = true
    val stealingAllowed = false
    println(age)
    println(name)
    println(count)
    println("The temperature is $temperature degrees celsius")
    println("Being $attribute is a desirable attribute to have")
    println(printBirthdayGreeting("Samson", 8))
    // using named parameters
    println(printBirthdayGreeting(age = 24, name = "Alex"))
    println(goodMorningGreeting(age = 24, name = "Alex"))

}

fun printBirthdayGreeting(name: String, age: Int): String {
    val greeting = "Happy birthday $name"
    val ageMention = "You are now $age year old"
    return "$greeting\n$ageMention"
}

// default arguments
fun goodMorningGreeting(name: String = "Housel", age: Int = 78): String {
    val greeting = "Happy birthday $name"
    val ageMention = "You are now $age year old"
    return "$greeting\n$ageMention"
}

// escaping characters works the same way as in js