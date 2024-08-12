package basics.collections

// ArrayDeque - implementation of a double-ended queue (allows removal and adding of elements at both ends)
// fills the role of both Stack and Queue data structure

fun main() {
    val deque = ArrayDeque(listOf(1, 2, 3))

    deque.addFirst(0)
    deque.addLast(4)
    println(deque)

    println(deque.first())
    println(deque.last())

    deque.removeFirst()
    deque.removeLast()

    println(deque)
}