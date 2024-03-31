package codingTest.stringManipulation.leetcode

fun main() {
    mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit"))

}

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    val counts: MutableMap<String, Int> = mutableMapOf()

    val words = paragraph.replace("\\W+".toRegex(), " ").lowercase().trim().split(" ")

    for (w in words) {
        if (!banned.contains(w)) {
            counts[w] = counts.getOrDefault(w, 0) + 1
        }

    }

    return counts.maxBy { it.value }!!.key
}
