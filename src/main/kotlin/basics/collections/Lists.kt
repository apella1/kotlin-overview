package basics.collections

fun main() {
    mutableLists()
}

val numbers = listOf("one", "two", "three")

fun listsCollection() {
    println("Number of elements ${numbers.size}")
    println("Index of element \"three\" ${numbers.indexOf("three")}")
}

// mutable lists
// MutableList is an implementation of ArrayList
val otherNums = mutableListOf(1, 3, 4)

fun mutableLists() {
    otherNums.add(2)
    otherNums.add(200)
    otherNums.removeLast()
    println(otherNums)
}