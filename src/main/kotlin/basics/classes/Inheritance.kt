package basics.classes

// `Any` is the superclass for all classes, which is default for classes with no supertypes declared
class Example // inherits from `Any`

// `Any` has 3 methods `equals()`, `hashCode()`, `toString()` thus the 3 are defined for all classes
// classes are final by default i.e cann't be inherited
// `open` is used to make classes inheritable
open class Base(val name: String) {
    init {
        println("Initializing a base class")
    }

    open val size: Int = name.length.also {
        println("Initializing size in base class $it")
    }
}


// base class initialization is done first
class DerivedFromBase(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for base class: $it") }) {
    init {
        println("Initializing a derived class")
    }

    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in the derived class: $it")
    }
}

// declaring an explicit supertype
open class InheritableClass(p: Int)

// if the derived class has a PC, the superclass must be initialized in that PC according to its params
class Derived(p: Int) : InheritableClass(p)

// if derived class has no PC, then each SC has to initialize the base type using `super`
// or it has to delegate to another constructor which does

// overriding methods
// explicit modifiers are required for overridable members and overrides
// if a function lacks `open` it can't be overridden
// (you can't declare a method with the same signature with an `override` or not)
// `open` has no effect for functions within a final class
// a member marked `override` is open. To prohibit overriding use `final`
// overriding works the same way in properties and methods

open class Circle : Shape() {
    // a `val` property can be overridden using `var` but not vise versa
    // vertexCount is `val` on Shape
    override var vertexCount = 7
    final override fun draw() {
    }
}

class SmallCircle : Circle() {
}

// override keyword can be used as part of property declaration in the PC
interface ShapeInterface {
    val vertexCount: Int
}

// params must have type annotation
// always has 4
class Square(override val vertexCount: Int = 4) : ShapeInterface {

}

// vertexCount can be set to any number later
class PolygonC : ShapeInterface {
    override var vertexCount: Int = 0
}

open class Rhombus() {
    open fun draw() {
        println("Drawing a rhombus")
    }

    val borderColor: String get() = "black"
}

class FilledRhombus : Rhombus() {
    override fun draw() {
        // calling the superclass implementation
        super.draw()
        println("Filling the rhombus")
    }

    val fillColour: String get() = super.borderColor
}

// `super@Outer` to access features of a superclass from an inner class within a derived class
class FilledRhombusWithAnInnerClass : Rhombus() {
    override fun draw() {
    }

    inner class Filler {
        fun fill() {
            println("Filling")
        }

        fun drawAndFill() {
            // call Rhombus implementation of draw
            super@FilledRhombusWithAnInnerClass.draw()
            fill()
            // uses Rhombus implementation of border colour get()
            println("Drawn a filled rhombus with colour: ${super@FilledRhombusWithAnInnerClass.borderColor}")
        }
    }
}

// overriding rules
// supertypes - superclasses, interfaces

open class MyBaseShape {
    open fun draw() {
        println("Drawing my base shape")
    }
}

interface MyBaseInterface {
    // interface members are open by default
    fun draw() {}
}

class MyDerivedShape : MyBaseShape(), MyBaseInterface {
    override fun draw() {
        // call to MyShape.draw()
        super<MyBaseShape>.draw()
        // call to MyBaseInterface.draw()
        super<MyBaseInterface>.draw()
    }
}