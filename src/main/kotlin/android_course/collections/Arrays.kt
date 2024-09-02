package android_course.collections

fun arrays() {
    val primeNumbers = arrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    println(primeNumbers.size)
    val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    // concatenating arrays
    val solarPlanets = rockPlanets + gasPlanets
    // accessing array elements by index i.e. subscript syntax
    // indices can also be used to set the values within the index of the array
    val earth = rockPlanets[2]
    gasPlanets[1] = "Big Saturn"
    println(earth)
    println(solarPlanets)
}

fun main() {
    arrays()
}