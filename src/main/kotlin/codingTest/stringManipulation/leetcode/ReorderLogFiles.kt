package codingTest.stringManipulation.leetcode

fun main() {
    reorderLogFiles(arrayOf("dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"))
}

fun reorderLogFiles(logs: Array<String>): Array<String> {
    val letterList = mutableListOf<String>()
    val digitList = mutableListOf<String>()

    for (log in logs) {
        val c = log.split(" ")[1][0]
        if (Character.isDigit(c))
            digitList.add(log)
        else
            letterList.add(log)
    }

    // 문자 리스트 정렬
    letterList.sortWith(Comparator { o1, o2 ->
        val idx1 = o1.split(" ", limit = 2)
        val idx2 = o2.split(" ", limit = 2)

        val compared = idx1[1].compareTo(idx2[1])
        if (compared == 0)
            idx1[0].compareTo(idx2[0])
        else
            compared
    })

    letterList.addAll(digitList)
    
    return letterList.toTypedArray()
}