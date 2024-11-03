package basics.questions.functions

fun main() {
    /*simple questions*/
    /*
    greet("Peter")
    println(addInline(4, 6))
    greetUser("Jay", "Guten Tag")
    describePerson(name = "John", age = 78, city = "Nairobi")
    */

    /*intermediate questions*/
    /*println(operate(4, 5, ::add))
    println(operate(4, 5, ::multiply))
    println(operate(4, 5) { a, b -> a % b })
    println(operate(3, 6, { a, b -> a / b }))
    val numbers = listOf(2, 3, 4, 5, 6, 7, 8, 9)
    println(filterEven(numbers) { a -> a % 2 == 0 })
    println(factorial(3))
    println("cat".isPalindrome())
    println("madam".isPalindrome())*/


    /*advanced questions*/
}

/* Simple Questions */
/*Write a function add that takes two integers as parameters and returns their sum.*/
fun add(a: Int, b: Int): Int {
    return a + b
}

fun addInline(a: Int, b: Int) = a + b

/*Write a function greet that takes a name as a parameter and prints "Hello, <name>!".*/
fun greet(name: String) {
    println("Hello, $name!")
}

fun greetInline(name: String) = println("Hello, $name!")

/*Write a function greetUser that takes a name and a greeting message, but the greeting message should have a default value of "Hello".*/
fun greetUser(name: String, message: String = "Hello") {
    println("$message, $name!")
}

/*Write a function describePerson that takes a name, age, and city, and prints a sentence about the person.
Use named arguments when calling the function.*/
fun describePerson(name: String, age: Int, city: String) {
    println("$name is $age years old and is from $city.")
}

/*Rewrite the following function as a single-expression function:*/
/*fun multiply(a: Int, b: Int): Int {
return a * b
}*/

fun multiply(a: Int, b: Int) = a * b

/*Intermediate Questions*/
/*
Write a function operate that takes two integers and a function (that itself takes two integers and returns an integer).
Use this operate function to perform addition, subtraction, multiplication, and division
by passing corresponding functions as arguments.
*/

typealias opFun = (c: Int, d: Int) -> Int

fun operate(a: Int, b: Int, operatorFun: opFun): Int {
    return operatorFun(a, b)
}

/*
Write a function filterEven that takes a list of integers and a lambda to check whether a number is even.
Return a list of all even numbers.
*/
fun filterEven(numbers: List<Int>, evenCheck: (a: Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (i in numbers) {
        if (evenCheck(i)) result.add(i)
    }
    return result
}

/*
Write a recursive function factorial that computes the factorial of a number.
*/
fun factorial(a: Int): Int {
    return when (a) {
        0 -> 1
        else -> a * factorial(a - 1)
    }
}

/*
Write an extension function isPalindrome for the String class that returns true if the string is a palindrome.
*/
fun String.isPalindrome(): Boolean {
// removing spaces and converting to lowercase
    val cleanedString = this.replace("\\s".toRegex(), "").lowercase()
    return cleanedString == cleanedString.reversed()
}

/*Advanced Questions*/
/*
Write an inline function measureTime that takes a lambda,
measures how long the lambda takes to execute, and prints the duration.
*/
typealias inlineFunParam = () -> Unit

inline fun measureTime(funParam: inlineFunParam) {

}


/*
Convert your recursive factorial function to be tail-recursive.
Ensure it can handle very large numbers efficiently.
*/

/*
Write a function buildString that uses a function literal with a receiver to append text to a StringBuilder
and returns the final string.
*/

/*Extremely Challenging Questions*/
/*
Write a function compose that takes two functions f and g
and returns a new function that composes them (f(g(x))).
*/

/*
Write a function curriedMultiply that takes an integer and returns a function
that takes another integer and multiplies them.
*/

/*
Implement a function partial that takes a function f with two parameters and "partially applies" one argument,
returning a new function that only requires the second argument.
*/

/*
Write a function that uses the "trampoline" technique to allow a recursive higher-order function
to avoid stack overflow for deep recursion (e.g., a recursive summation function).
*/
