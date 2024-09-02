package android_course.tasks.event_tracking

fun printFirstAndLastEvent() {
    println("First event of the day: ${events.first().title}")
    println("Last event of the day: ${events.last().title}")
}