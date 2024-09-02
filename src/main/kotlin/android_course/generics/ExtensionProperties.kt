package android_course.generics

// extension functions
/*fun Quiz.StudentProgressInner.printProgressBar() {
    repeat(Quiz.answered) {
        print("A")
    }
    repeat(Quiz.total - Quiz.answered) {
        print("N")
    }
    println()
}*/

// rewriting extension functions using interfaces
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}