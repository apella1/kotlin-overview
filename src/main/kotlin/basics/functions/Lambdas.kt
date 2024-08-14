package basics.functions

// higher-order functions and lambdas

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }

    return accumulator
}

// lambdas are code blocks in curly brackets
fun main() {
    val items = listOf(1, 2, 3, 4, 5)
    items.fold(0, {
        // when a lambda has params, they go first followed by a ->
            acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // the last expression is considered the return value
        result
    })

    // param types in lambdas are optional if they can be inferred
    val joinedToString = items.fold("Elements: ", { acc, i -> acc + " " + i })

    // function references can be used for higher order function calls
    val product = items.fold(1, Int::times)
    println(joinedToString)
    println(product)
}