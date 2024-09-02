package android_course.collections

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)


val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun higherOrderFunctionsForEach() {
    // forEach() - works similarly as the for loop and repeat()
    cookies.forEach {
        println("Menu Item: ${it.name}")
    }
}

fun higherOrderFunctionsMap() {
    val fullMenu = cookies.map {
        "${it.name}: $${it.price}"
    }
    /*for (item in fullMenu) {
        println(item)
    }*/
    fullMenu.forEach {
        println(it)
    }
}

fun higherOrderFunctionsFilter() {
    val softBakedMenu = cookies.filter {
        it.softBaked
    }
    val softBakedMenuItemPrices = softBakedMenu.map {
        "${it.name} - ${it.price}"
    }
    softBakedMenuItemPrices.forEach {
        println(it)
    }
}

// partition when splitting a list into 2
fun higherOrderFunctionsGroupBy() {
    // turning a list into a map
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    /*val evenNumbers = numbers.groupBy { it % 2 == 0 }
    evenNumbers.forEach {
        println(it)
    }*/
    val groupedNumbers = numbers.groupBy { it % 2 }
    val oddNumbers = groupedNumbers[1] ?: listOf()
    val evenNumbers = groupedNumbers[0] ?: listOf()

    val groupedMenu = cookies.groupBy { it.softBaked }
    val softMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println()
    println("Odd Numbers:")
    oddNumbers.forEach {
        println(it)
    }
    println()
    println("Even Numbers:")
    evenNumbers.forEach {
        println(it)
    }
    println()
    println("Soft Cookies:")
    softMenu.forEach {
        println(it.name)
    }
    println()
    println("Crunchy Cookies:")
    crunchyMenu.forEach {
        println("${it.name} - ${it.price}")
    }
}

fun higherOrderFunctionsFold() {
    val totalPrice = cookies.fold(0.0) { total, it ->
        total + it.price
    }
    println(totalPrice)
    // using sum
    println(cookies.map { it.price }.sum())
}

fun higherOrderFunctionsSortedBy() {
    val alphabeticMenu = cookies.sortedBy {
        it.name
    }
    // sort() is available if the data type has a natural sorting order
    alphabeticMenu.forEach {
        println(it.name)
    }

    // sorting for double works from lowest to highest
    val priceSortedMenu = cookies.sortedBy {
        it.price
    }
    priceSortedMenu.forEach {
        println("${it.name} - ${it.price}")
    }
}

fun main() {
    higherOrderFunctionsSortedBy()
}