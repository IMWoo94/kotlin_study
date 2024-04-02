package codingTest.stringManipulation.leetcode

fun main() {
    maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
}


fun maxProfit(prices: IntArray): Int {
    var max = 0
    var min = prices[0]

    for (num in prices) {
        min = min.coerceAtMost(num)

        max = max.coerceAtLeast(num - min)
    }
    return max
}
