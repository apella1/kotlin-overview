package basics.standartlib

import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.nanoseconds
import kotlin.time.Duration.Companion.seconds

// creating duration using extension properties
// DAYS refer to period of 24hours

val fiveHundredMilliseconds: Duration = 500.milliseconds
val zeroSeconds: Duration = 0.seconds
val twentyMinutes = 20.minutes
val negativeNanoSecond = (-1).nanoseconds
val infiniteDays = Double.POSITIVE_INFINITY.days
val negativeInfiniteDays = Double.NEGATIVE_INFINITY.days

fun main() {
    println(infiniteDays + negativeInfiniteDays)
}