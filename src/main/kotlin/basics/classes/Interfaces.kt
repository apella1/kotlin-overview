package basics.classes

// can store declarations of abstract methods as well as method implementations
// unlike abstract classes, they can't store state
// they can have properties, but these need to be abstract or provide accessor implementations

interface Operations {
    // properties can either be abstract or provide implementation for accessors
    // properties can't have backing fields therefore the accessors declared can't reference them
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun draw()
    fun write() {
        // optional body
    }
}

// a class or an object can implement one or more interfaces

class Child : Operations {
    override var prop = 3
    override fun draw() {
        prop = 4
        println("Val overridden with var and reassigned")
        println("Var cannot be overridden with val!")
    }
}

// interface inheritance

interface Named {
    val name: String
}

interface PersonInterface : Named {
    val firstName: String
    val lastName: String

    override val name: String
        get() = "$firstName $lastName"
}

data class Employee(
    // implementing name is not required
    override val firstName: String,
    override val lastName: String,
    val position: String
) : PersonInterface

// resolving overriding conflicts
interface A {
    fun foo() {
        println("A")
    }

    // abstract if the function has no body
    fun bar()
}

interface B {
    fun foo() {
        println("B")
    }

    fun bar() {
        println("bar")
    }
}

class C : A {
    override fun bar() {
        println("A")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}