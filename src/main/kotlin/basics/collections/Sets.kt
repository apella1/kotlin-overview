package basics.collections

val favouriteMarvelVillains = setOf("apocalypse", "reverse flash", "apocalypse", "bastian")
val favMarvelCharacters = mutableSetOf("wolverine", "cyclops", "jean")

fun main() {
    favMarvelCharacters.add("night crawler")
    println(favouriteMarvelVillains)
    println(favMarvelCharacters)
    if (favMarvelCharacters.contains("captain marvel")) println("Captain Marvel made the list")
    println("Dark Seid" in favouriteMarvelVillains)
}

// the default implementation of MutableSet, LinkedHashSet, preserves the order of insertion
// HashSet says nothing about the elements order but requires less memory
// the same is similar with LinkedHashMap(default implementation of MutableMap) and HashMap