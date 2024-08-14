package basics.functions

// single expression functions
// explicitly declaring the return type is optional as it can be inferred by the compiler
fun double(x: Int) = x * 2

// explicit return types
// functions with block bodies must always specify the return types explicitly


// variable number of arguments
// only one param can be marked as vararg
fun <T> asList(vararg ts: T): List<T> {
    val res = ArrayList<T>()
    for (t in ts)
        res.add(t)
    return res
}

fun main() {
    val a = arrayOf(5, 6, 7)
    val b = intArrayOf(8, 9)
    // to pass a primitive-type array to a vararg, it has to be converted into a regular (typed) array
    val list = asList(1, 2, 3, 4, *a, *b.toTypedArray())
    for (n in list) println(n)
    findFixPoint(4.0)
}

// function scope
// local functions (functions within other functions)
// a local function can access the variables of the outer functions (the closure of the outer function)
// member functions - defined within a class
// member functions are called with dot notation e.g ClassName().functionName()
// generic functions

// tail-recursive functions

val eps = 1E-10

tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))