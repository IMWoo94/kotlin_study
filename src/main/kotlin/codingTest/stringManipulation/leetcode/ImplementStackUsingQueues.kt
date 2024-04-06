package codingTest.stringManipulation.leetcode

import java.util.*

val queue = LinkedList<Int>()

fun push(x: Int) {
    queue.push(x)

    for (i in 1 until queue.size) {
        queue.push(queue.remove())
    }
}

fun pop(): Int {
    return queue.remove()
}

fun top(): Int {
    return queue.peek()
}

fun empty(): Boolean {
    return queue.size == 0
}