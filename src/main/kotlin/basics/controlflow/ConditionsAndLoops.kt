package basics.controlflow

// if expression
// if returns a value i.e. there is  no ternary operator (condition ? then : else)
// else if, else - similar to most languages
fun main() {
    forLoops()
}


fun ifExpression() {
    var max = 10
    var b = 17
    if (max < b) max = b
    println(max)

    // branches of an if expression can be blocks
    // in that case, the last expression is the value of the block
    // for this usage, the else block is mandatory
    val maxNo = if (max > b) {
        println("Choose max")
        max
    } else {
        println("Choose b")
        b
    }
}

// when expression
// if when is used as an expression, the else branch is mandatory,
// unless the compiler can prove that all possible  cases are covered with branch conditions
// e.g enum class entries and sealed class subtypes

fun whenExpression(x: Int) {
    val validNumbers = listOf(1, 2, 3, 4)
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        // combining behaviour for multiple cases
        3, 4 -> println("x == 3 or x == 4")
        // arbitrary expressions, like constants, can be used as branch conditions
        // s.toInt() -> println("s encodes x")

        // values can also be checked to be in or !in a range or a collection
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> {
            println("x is neither 1, 2, 3 nor 4")
        }
    }
}


// checking if a value is of a particular type using `when`
fun hasPrefix(x: Any) {
    when (x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
}

// `when` can also be used as a replacement of if-else chain if no argument is provided
fun isOdd(x: Int): Boolean {
    return when {
        x % 2 == 0 -> true
        else -> false
    }
}

fun isEven(y: Int): Boolean {
    return y % 2 == 1
}

fun whenAsIfElseReplacement() {
    val x = 6
    val y = 3

    when {
        isEven(x) -> println("x is even")
        isOdd(y) -> println("y is odd")
        else -> println("x + y is odd")
    }
}

// for loops
// for (item in collection) print(item)

fun forLoops() {
    // iterating over a range of number using the `range` expression

    for (i in 1..3) {
        println(i)
    }

    println("using downTo")
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    // stepping up
    for (i in 10..40 step 10) {
        println(i)
    }

    // using withIndex library function
    val nums = intArrayOf(2, 4, 5)
    for ((index, value) in nums.withIndex()) {
        println("then element at index $index is $value")
    }
}

// while loops
fun whileLoops() {
    var x = 10

    do {
        x++
    } while (x < 15)

    while (x > 0) {
        x--
    }
}

// break and continue in loops
