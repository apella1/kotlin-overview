package basics.collections

// Map<K, V> doesn't inherit from Collection however it's a Kotlin collection type as well

val numbersMap = mapOf("first" to 1, "second" to 2, "third" to 3, "fourth" to 4)

fun main() {
    mapsCollection()
}

fun mapsCollection() {
    println("Keys with lengths greater than 5: ${numbersMap.keys.filter { it.length > 5 }}")
    println("All values: ${numbersMap.values}")
}

// two maps containing equal pairs are equal regardless of the pair order
// mutable maps allow write operations