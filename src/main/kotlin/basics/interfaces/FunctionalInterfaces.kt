package basics.interfaces

// functional (SAM) interfaces
// SAM - single abstract method
// a functional interface is an interface with only one abstract method

fun interface KRunnable {
    fun invoke()
}

// SAM conversions
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

// using IntPredicate without SAM conversion
val isEven = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}

// leveraging SAM conversion
val isEvenSAM = IntPredicate { it % 2 == 0 }

fun main() {
    println("Is 7 even: ${isEvenSAM.accept(7)}")
}

// Migration from an interface with a constructor function to a functional interface
interface Printer {
    fun print()
}

fun Printer(block: () -> Unit): Printer = object : Printer {
    override fun print() = block()
}

// the above code can be replaced with
// with callable references to functional interfaces constructors
fun interface PrinterCallableReferenceExample {
    fun print()
}

// the constructor will be created implicitly and any code with the reference ::PrinterCallableReferenceExample
// will compile
// e.g documentStorage.addPrinter(::Printer)

// concepts to learn - binary compatibility


// functional interfaces vs type aliases
// typealiases are just names for existing types - they don't create a new type
// functional interfaces create a new type
typealias IntPredicateTA = (a: Int) -> Boolean

val isOdd: IntPredicateTA = { it % 2 == 1 }