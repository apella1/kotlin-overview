package basics.classes

// class declaration -> class name, class header(specifying params)
// the primary constructor, class body '{}'
// both header and body are optional

// constructors
class Person constructor(firstName: String) {
}

// constructor keyword can be omitted if the primary constructor has no visibility modifiers
// or annotations
class Vehicle(name: String) {
}

// class header cannot contain any runnable code
// initializer blocks are used within the class body to run code during object creation
class InitOrderDemo(order: String) {
    val firstProperty = "First property: $order".also(::println)

    init {
        println("First initializer block that prints $order")
    }

    val secondProperty = "Second property: ${order.length}".also(::println)

    init {
        println("Second initializer block that prints ${order.length}")
    }
}

// primary constructor params can also be used for property initializers used within the class body
class Customer(name: String) {
    val customerKey = name.uppercase()
}

// concise syntax for declaring and initializing properties on the primary constructor
// default values can be included as well
// properties can be mutable (var) or immutable (val)
// trailing commas can be use when declaring class properties
class Language(
    val age: Int,
    val name: String,
    val speaker: List<String>,
)

class Subject(val name: String, val isDifficult: Boolean = false) {
}

// secondary constructors

class PetOwner(val pets: MutableList<Pet> = mutableListOf()) {}

class Pet() {
    constructor(owner: PetOwner) : this() {
        owner.pets.add(this) // adds the pet to the owner's list
    }
}

// if a class has a primary constructor, each secondary constructor needs to delegate to the primary constructor
// directly or indirectly through another secondary constructor(s)

class AnotherPerson(val fullName: String) {
    val children: MutableList<AnotherPerson> = mutableListOf()

    constructor(fullName: String, parent: AnotherPerson) : this(fullName) {
        parent.children.add(this)
    }
}

// delegation happens implicitly when a class has no primary constructor
// and the initializer blocks are still executed
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("constructor: $i")
    }
}

// for non-abstract classes - primary constructors with no arguments (public) will be generated
// if no primary constructor is provided
// to avoid having an public constructor, declare an empty primary constructor with non-default visibility

class Furniture private constructor() {
}

// creating instances of a class
// the constructor is called in the same way a function is
// kotlin has no `new` keyword
val pete = Person("Pete")

// abstract classes
// an abstract member does not have an implementation in its own class
// `open` is not necessary for abstract classes and methods

abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        TODO("Not yet implemented")
    }
}

// non-abstract open members can be overridden by an open one

open class Shape() {
    open val vertexCount: Int = 0
    open fun draw() {}
}

abstract class ComplicatedShape : Shape() {
    // instances of ComplicatedShape need to implement their own draw methods
    abstract override fun draw()
}