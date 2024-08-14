package basics.classes

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

// implementation of type-safe enums
// each enum constant, separated by a comma, is an object

enum class Directions {
    NORTH, SOUTH, WEST, EAST
}


// anonymous classes
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

// implementing interfaces in enum classes
// an enum class can implement an interface but it cannot derive from a class
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int): Int = apply(t, u)
}

// all enum classes implement the Comparable interface by default
// constants in enum classes are defined in the natural order