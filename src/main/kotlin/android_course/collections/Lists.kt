package android_course.collections

// ordered, resizable collection
fun lists() {
    val programmingLanguages = listOf("Kotlin", "Java", "JavaScript")
    // get can be used in place of the subscript syntax
    val js = programmingLanguages.get(2)
    println(js)

    // indexOf - returns the first occurrence of the provided element
    // -1 is output when there isn't a match
    println("Index of Java: ${programmingLanguages.indexOf("Java")}")

    // looping
    // there's no var or val before lang as it is assumed to be get-only
    for (lang in programmingLanguages) {
        println(lang)
    }

    // adding elements to a mutable list
    // the add() method is overloaded i.e. add(element) and add(index, element)
    // elements can also be updated at a specific index using the subscript syntax

    val stronglyTypedLanguages = mutableListOf("Java", "Kotlin", "Go", "Rust")
    stronglyTypedLanguages.add("Typescript")
    stronglyTypedLanguages.add(0, "Haskell")
    // removing elements -> remove(element), removeAt(index)
    stronglyTypedLanguages.remove("Typescript") // removeLast(), removeAt(stronglyTypedLanguages.size - 1)
    stronglyTypedLanguages.remove("Nothing")
    println("Strongly Typed")
    for (lang in stronglyTypedLanguages) println(lang)

    // contains method checks for the existence of an element in a list
    println(stronglyTypedLanguages.contains("Ocaml"))
    // `in` can also be used more concisely
    println("Gleam" in stronglyTypedLanguages)
    println("Ada" in programmingLanguages)
}

fun main() {
    lists()
}