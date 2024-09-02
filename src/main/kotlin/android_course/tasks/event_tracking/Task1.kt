package android_course.tasks.event_tracking

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int,
)

fun main() {
    val event = Event(
        "Study Kotlin", "Commit to studying Kotlin at least 1 hour per day.", Daypart.EVENING, 15
    )
    println(event)
    println(events.size)
    println("You have ${shortEvents.size} short events.")
    for (item in daypartGroupings) {
        println("${item.key}: ${item.value}")
    }
    // alternatively for task 5
    groupedEventsByDaypart.forEach { daypart, events ->
        println("$daypart: ${events.size}")
    }
    printFirstAndLastEvent()
}