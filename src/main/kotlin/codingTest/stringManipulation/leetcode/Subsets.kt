package codingTest.stringManipulation.leetcode

import java.util.*

fun subsets(nums: IntArray): List<List<Int>> {
    val results: MutableList<List<Int>> = mutableListOf()

    fun dfs(index: Int, path: Deque<Int>) {
        results.add(ArrayList(path))

        for (i in index until nums.size) {
            path.add(nums[i])
            dfs(i + 1, path)
            path.removeLast()
        }
    }

    dfs(0, ArrayDeque())
    return results
}