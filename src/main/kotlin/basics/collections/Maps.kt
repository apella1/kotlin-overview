package basics.collections

// Map<K, V> doesn't inherit from Collection however it's a Kotlin collection type as well

val numbersMap = mapOf("first" to 1, "second" to 2, "third" to 3, "fourth" to 4)

fun main() {
    println("The beginning of map's main function")
    val diff = 9
    if (dictStore.containsValue(diff)) {
        println(
            "The key is: ${
                dictStore.keys.first { key ->
                    dictStore[key] == diff
                }
            }"
        )
    }
}

fun mapsCollection() {
    println("Keys with lengths greater than 5: ${numbersMap.keys.filter { it.length > 5 }}")
    println("All values: ${numbersMap.values}")
}

val dictStore = mutableMapOf(0 to 7, 1 to 3, 2 to 9, 3 to 12)

// two maps containing equal pairs are equal regardless of the pair order
// mutable maps allow write operations