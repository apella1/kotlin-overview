package basics.questions.loops

import kotlin.math.sqrt

/*Here are some questions to help you practice looping in Kotlin:

Fibonacci Series:
Write a program to print the first n numbers in the Fibonacci sequence.

Reversing a Number:
Write a program to reverse a given integer. For example, if the input is 1234, the output should be 4321.

Sum of Digits:
Write a program to calculate the sum of digits of a given number (e.g., for 123, output should be 6).

Pattern Printing:
Write a loop to print the following pattern for n rows:
markdown
Copy code
*
* *
* * *
* * * *
Modify the pattern to print a reversed triangle:
markdown
Copy code
* * * *
* * *
* *
*

Character Frequency Count:
Given a string, write a program to count the frequency of each character.

Array Sum and Average:
Write a program to find the sum and average of elements in an array.

Palindrome Checker:
Write a program that checks if a given word or number is a palindrome.

Number of Vowels and Consonants:
Write a program to count the number of vowels and consonants in a given string.

Find Maximum and Minimum in an Array:
Write a program to find the largest and smallest elements in an array.

Finding Duplicates:
Write a program to find duplicate numbers in an array.

Range Divisibility:
Print all numbers between two given numbers that are divisible by 3 but not by 5.

Power Calculation:
Write a program that calculates x to the power of n using a loop.

Alphabet Pattern:
Write a loop to print the following pattern for n rows:
mathematica
Copy code
A
B B
C C C
D D D D

Sorting Array Elements:
Write a program to sort the elements of an array in ascending order using loops.

Frequency of Numbers in an Array:
Given an array, write a program to count the frequency of each number.
*/

fun main() {
    printPrimeNumbers()
}

/* #1 Basic Counting Loop:
Write a program that prints numbers from 1 to 100.
Modify the program to print only even numbers between 1 and 100.*/

fun basicCountingLoop() {
    for (i in 1..100) {
        println(i)
    }
    // modifying to only print even numbers
    for (i in 2..100 step 2) {
        println(i)
    }

    for (i in 1..100) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

/*#2 Summation:
Calculate the sum of numbers from 1 to 50.
Calculate the sum of all odd numbers between 1 and 100.*/

fun summation() {
    var sumOfNumbersOneToFifty = 0
    var sumOfOddNumbersOneToHundred = 0

    for (i in 1..50) {
        sumOfNumbersOneToFifty += i
    }

    for (i in 1..100 step 2) {
        sumOfOddNumbersOneToHundred += i
    }

    println("Sum of odd numbers from 1 to 100: $sumOfOddNumbersOneToHundred")
    println("Sum of numbers from 1 to 50: $sumOfNumbersOneToFifty")
}

/* #3 Factorial Calculation:
Write a program to calculate the factorial of a given number n (e.g., n!).*/

fun factorialCalculation(x: Int): Int {
    return when (x) {
        0 -> 1
        else -> x * factorialCalculation(x - 1)
    }
}

fun factorial(x: Int): Int {
    return if (x == 0) {
        1
    } else {
        x * factorial(x - 1)
    }
}

fun factorialLoops(x: Int): Int {
    if (x == 0) {
        return 1
    }
    var factorial = 1
    for (i in 1..x) {
        factorial *= i
    }
    return factorial
}

/* #4 Multiplication Table:
Create a multiplication table for a given number up to 10 (e.g., for 5, print 5 x 1 = 5, 5 x 2 = 10, etc.).*/

fun printMultiplicationTable(x: Int) {
    for (i in 1..10) {
        println("$x x $i = ${x * i}")
    }
}

/* #5 Prime Numbers:
Print all prime numbers between 1 and 100.
Count the number of prime numbers between two given numbers.
*/

fun isPrimeNumber(x: Int): Boolean {
    if (x <= 1) return false
    if (x <= 3) return true

    // optimization: check divisibility only up to the square root of the number
    for (i in 2..sqrt(x.toDouble()).toInt()) {
        if (x % i == 0) return false  // if divisible by any number other than 1 and itself, it's not prime
    }
    return true
}

fun printPrimeNumbers() {
    var noOfPrimeNos = 0
    for (i in 1..100) {
        if (isPrimeNumber(i)) {
            println(i)
            noOfPrimeNos += 1
        }
    }
    println("No of prime numbers between 1 and 100 is $noOfPrimeNos")
}