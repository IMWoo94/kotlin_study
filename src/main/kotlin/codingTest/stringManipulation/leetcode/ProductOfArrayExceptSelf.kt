package codingTest.stringManipulation.leetcode

fun main() {
    println(productExceptSelf(intArrayOf(1, 2, 3, 4)))
}

fun productExceptSelf(nums: IntArray): IntArray {
    val result = IntArray(nums.size)

    var p = 1
    for (i in nums.indices) {
        result[i] = p
        p *= nums[i]
    }

    p = 1
    for (i in nums.indices.reversed()) {
        result[i] *= p
        p *= nums[i]
    }

    return result

}