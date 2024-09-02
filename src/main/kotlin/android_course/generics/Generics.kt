package android_course.generics

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz : ProgressPrintable {
    override val progressText: String get() = "$answered of $total answered"
    val question1 = Question<String>("What's your name?", "King", Difficulty.EASY)
    val question2 = Question<Boolean>("Are you tall?", true, Difficulty.HARD)
    val question3 = Question<Int>("How many miles did you run", 12, Difficulty.MEDIUM)

    override fun printProgressBar() {
        repeat(answered) {
            print("A")
        }
        repeat(total - answered) {
            print("N")
        }
        println()
        println(progressText)
    }

    fun printQuiz() {
        println()
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }

    companion object StudentProgressInner {
        var total: Int = 10
        var answered: Int = 4
    }
}

// extension properties do not store data so must be get-only
// val Quiz.StudentProgressInner.progressText: String get() = "$answered of $total answered"


fun main() {
    // the properties can be accessed using only the Quiz class
    println("${Quiz.answered} of ${Quiz.total} answered.")
    // using the progressText extension property
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
    // instantiation Quiz first because printProgressBar() is a member of the class
    Quiz().printProgressBar()
    Quiz().apply {
        printQuiz()
    }
}


