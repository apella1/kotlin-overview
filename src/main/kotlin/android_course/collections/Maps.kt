package android_course.collections

// unique keys are mapped to other values

fun maps() {
    val planetMoons = mutableMapOf("Earth" to 1, "Saturn" to 12, "Neptune" to 14, "Uranus" to 4, "Mercury" to 0)
    println(planetMoons.size)
    // subscript syntax can be used for maps as well (setting and retrieving values)
    // get() and set() methods are also available
    planetMoons["Pluto"] = 9
    planetMoons.set("Venus", 4)
    println(planetMoons["Pluto"])
    println(planetMoons.get("Saturn"))
    println(planetMoons)

    // remove - removes the key-value pair with the specified key
    planetMoons.remove("Earth")
}

fun main() {
    maps()
}