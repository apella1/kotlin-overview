package android_course.tasks.event_tracking

val Event.durationOfEvent: String
    get() = if (this.duration < 60) {
        "short"
    } else {
        "long"
    }
