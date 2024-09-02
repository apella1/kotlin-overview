package android_course.tasks.event_tracking

val groupedEventsByDaypart = events.groupBy { it.daypart }
val morningEvents = groupedEventsByDaypart[Daypart.MORNING] ?: listOf()
val afternoonEvents = groupedEventsByDaypart[Daypart.AFTERNOON] ?: listOf()
val eveningEvents = groupedEventsByDaypart[Daypart.EVENING] ?: listOf()

val daypartGroupings = mapOf(
    Daypart.MORNING to morningEvents.size,
    Daypart.AFTERNOON to afternoonEvents.size,
    Daypart.EVENING to eveningEvents.size
)