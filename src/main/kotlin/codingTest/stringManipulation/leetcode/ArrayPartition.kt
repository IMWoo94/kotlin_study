package codingTest.stringManipulation.leetcode

fun main() {
    print(arrayPairSum(intArrayOf(1, 4, 3, 2)))
}

fun arrayPairSum(nums: IntArray): Int {
    nums.sort()

    var sum = 0

    for ((i, num) in nums.withIndex()) {
        if (i % 2 == 0) {
            sum += num
        }
    }

    return sum
}