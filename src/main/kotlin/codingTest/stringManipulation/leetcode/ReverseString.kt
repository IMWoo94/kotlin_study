package codingTest.stringManipulation.leetcode

fun main() {
    reverseString(charArrayOf('h', 'e', 'l', 'l', 'o'))
}

fun reverseString(s: CharArray): Unit {
    var start = 0
    var end = s.size - 1

    while (start < end) {
        s[start] = s[end].also { s[end] = s[start] }
        start++
        end--
    }
}