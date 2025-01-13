package basics.questions.collections

/*
Intermediate Questions
Write a Kotlin function to merge two lists and remove duplicates.
Create a program to find the second largest element in a list of integers.
Implement a function that rotates a list to the right by k positions.
Write a program to find all pairs of integers in a list that sum up to a given target.
Create a list of numbers and group them into even and odd using Kotlin's collection functions.
Write a function that partitions a list into two lists based on a predicate.
Implement a program to check if a list is a palindrome.
Write a program to find the intersection of two lists.
Create a function to flatten a nested list (e.g., List<List<Int>> to List<Int>).
Write a Kotlin program to find the frequency of each element in a list.
Advanced Questions
Write a program to implement a custom map function for a list.
Create a function to find all permutations of a list of integers.
Write a Kotlin program to perform a binary search on a sorted list.
Implement a function to find the longest increasing subsequence in a list of integers.
Write a program to sort a list of custom objects based on multiple properties.
Implement a function to find the majority element in a list (an element that appears more than half the time).
Write a Kotlin program to generate all subsets of a list.
Create a program to find the shortest path in an unweighted graph represented as an adjacency list.
Implement a function to find the maximum sum of a subarray using Kadane's algorithm.
Write a program to detect and remove duplicate elements from a list while preserving the order.
* */

/*
Simple Questions
Create a list of integers and remove all occurrences of the number 3.
* */

fun main() {
    printLenOfEachStringInList()
}

// Write a Kotlin program to create a list of integers and print all even numbers.
fun createIntegersAndPrintEvenNumbers() {
    val integers = (1..50).toList()
    integers.filter { it % 2 == 0 }.forEach { println(it) }
}

//How would you create a list of strings and check if a specific string exists in the list?
fun createAListOfStringsAndCheckOnesExistence() {
    val createdStrings = listOf("Hello", "Kotlin", "Book", "Logo")
    println(checkForValueInList(createdStrings, "Cobra"))
}

fun checkForValueInList(list: List<String>, word: String): Boolean {
    return word in list
}

//Create a function that takes a list as input and returns the last element of the list.
fun returnLastElementInList(list: List<Any>): Any {
    return list.last()
}

// Write a Kotlin program to find the sum of all elements in a list of integers.
fun findSumOfAllElements(list: List<Int>): Int {
    return list.sum()
}

fun findSumOfAllElementsLoops(list: List<Int>) {
    var sum = 0
    list.forEach {
        sum += it
    }
    println(sum)
}

// How can you reverse a list in Kotlin? Write a program to demonstrate this.
fun reverseAList(list: List<Any>): List<Any> {
    return list.reversed()
}

//Create a list of numbers and find the index of the first occurrence of the number 5.
fun findFirstOccurrenceOf5InList() {
    val list = (1..10).toList()
    println(list.indexOfFirst { it == 5 })
}

//Write a program to convert a list of integers into a comma-separated string.
fun convertAListIntoACommaSeparatedString(list: List<Int>): String {
    var str = ""
    list.forEach { str += "$it," }
    return str
}

//Create a list of strings and write a program to print the length of each string.
fun printLenOfEachStringInList() {
    val strs = listOf("Jettison", "Moon", "Hyperbole")
    strs.forEach { println("$it: len: ${it.length}") }
}

// Write a Kotlin program to find the maximum and minimum values in a list of integers.
fun findMaxAndMinForList(list: List<Int>) {
    println("Max: ${list.max()}")
    println("Min: ${list.min()}")
}
