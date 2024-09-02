package android_course.collections

// unordered, unique values
// hashCode method of a class
/*hash collision - when two objects have the same hash code(rare)*/
// a set uses hash codes as an array of indices
/*
there can be about 4B hash codes, thus a set can be thought of as an array of lists
a list element within the array might have 1 or more elements(for colliding hash codes)
* */
fun sets() {
    val carCompanies = mutableSetOf("Audi", "Toyota", "Land Rover")
    carCompanies.add("Akura")
    carCompanies.add("Hyundai")
    carCompanies.add("Audi")
    println("Lexus" in carCompanies)
    println(carCompanies.contains("Ford Motors"))
    println("Car Companies size: ${carCompanies.size}")
}

fun main() {
    sets()
}