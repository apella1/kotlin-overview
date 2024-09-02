package android_course.generics

// only one instance of the class necessary
// e.g player stats on a game for current user, auth instance, accessing remote data source
// singletons can't have a constructor as you can't create instances directly

object StudentProgress {
    var total: Int = 10
    var answered: Int = 1
}

fun main() {
    // accessing the properties of the singleton object using the dot operator
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
}