package basics.collections

// sets, lists and maps
// read-only collection types are covariant
// i.e if Car inherits from Locomotive then List<Car> can be used anywhere List<Locomotive> is required
// mutable collections aren't covariant

fun main() {
    mutableCollections()
}

val fruits = listOf("Apple", "Banana", "Mango", "Oranges")
val randomStuff = listOf("1", "hello", "34", "king", "9")
val stringSet = setOf("one", "two", "three")

fun lists() {
    for (fruit in fruits) {
        println(fruit)
    }
    // string concatenations vs templates
    fruits.forEach { fruit -> println("For each: $fruit") }
    fruits.map { it -> println("map: $it") }

    val nums = randomStuff.mapNotNull {
        it.toIntOrNull()
    }

    println(nums.toString())
}

// Collection<T> inherits from Iterable<T>

fun printAll(strings: Collection<String>) {
    for (s in strings) print("$s ")
    println()
}

// MutableCollection<T> is a collection with write operation
fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    val articles = setOf("a", "an", "the", "A", "An", "The")
    shortWords -= articles
}

fun mutableCollections() {
    val words = "A long time ago in a far away land full of mystical creatures".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 3)
    println(shortWords)
}