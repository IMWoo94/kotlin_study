package codingTest.stringManipulation.leetcode

import java.util.*

fun main() {
    println(isValid("()"))
}

fun isValid(s: String): Boolean {
    var map = mutableMapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )

    var stack: Deque<Char> = ArrayDeque()

    for (i in s.indices) {
        if (!map.containsKey(s[i])) {
            stack.push(s[i])
        } else if (stack.isEmpty() || map[s[i]] != stack.pop()) {
            return false
        }
    }

    return stack.isEmpty()
}