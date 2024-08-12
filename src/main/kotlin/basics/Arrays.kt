package basics

// primitive-type arrays vs object-type arrays

fun main() {
    primitiveArrays()
}

fun arrays() {
    println(simpleArray.joinToString())
    println(simpleArray[1].toString())
    println(nullArray.joinToString())
    println(exampleEmptyArray.joinToString())
    println(otherNullArray.joinToString())
    println(twoDArray.contentDeepToString())
    println(threeDArray.contentDeepToString())
    println(fourDArray[0][0])
}

val simpleArray = arrayOf(1, 2, 3)

// due to type inference the types can be specified on either the LHS or RHS
val nullArray: Array<Int?> = arrayOfNulls(3)
val otherNullArray = arrayOfNulls<String?>(4);
var exampleEmptyArray = emptyArray<String>()


// nested/multi-dimensional arrays
val twoDArray = Array(2) { Array<Int>(2) { 1 } }
val threeDArray = Array(3) { Array<Int>(3) { 3 } }
val fourDArray = Array(4) { Array<String>(4) { "hello" } }

// arrays are invariant (Array<String> cannot be assigned to Array<any>)
// to prevent possible runtime falilure


fun passVarArgs() {
    val lettersArray = arrayOf("a", "b")
    printAllStrings(*lettersArray, "c", "d")
}

fun printAllStrings(vararg strings: String) {
    for (str in strings) {
        print(str)
    }
}


// compare arrays
val firstArray = arrayOf(1, 2, 4)
val secondArray = arrayOf(1, 2, 4)

fun compareArrays() {
    println(firstArray.contentEquals(secondArray))
    println(firstArray.contentDeepEquals(secondArray))
    println(firstArray contentEquals secondArray)
}

// == and != compares if arrays are pointing to the same object
// which might not be the desired comparison

// transforming the elements of an array

fun transformArray() {
    // sum can only be use with numeric data types
    println(firstArray.sum())
    // shuffle - random shuffle
    secondArray.shuffle()
    println(secondArray.joinToString())
    secondArray.shuffle()
    println(secondArray.joinToString())
}

// convert arrays to collections
// convert to list or set

fun convertArraysToCollection() {
    println(firstArray.toSet());
    println(secondArray.toList())

    // converting to map
    // only arrays of Pair<K, V> can be converted to map
    val pairArray = arrayOf("apple" to 120, "banana" to 40, "mango" to 10)
    println(pairArray.joinToString())
    println(pairArray.toMap())
}

// primitive-type arrays
// allows the storing of primitive values without the side effect of the boxing overhead

// initializes the values to the zero value i.e 0 for int, 0.0 for double
val examplePrimitiveIntArray = IntArray(4);
val examplePrimitiveDoubleArray = DoubleArray(4)

fun primitiveArrays() {
    println(examplePrimitiveIntArray.joinToString())
    println(examplePrimitiveDoubleArray.joinToString())
}