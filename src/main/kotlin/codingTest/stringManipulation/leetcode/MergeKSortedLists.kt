package codingTest.stringManipulation.leetcode

import codingTest.stringManipulation.common.ListNode
import java.util.*

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val pq = PriorityQueue<ListNode>(
        { o1, o2 ->
            when {
                o1.`val` == o2.`val` -> 0
                o1.`val` > o2.`val` -> 1
                else -> -1
            }
        }
    )

    val root = ListNode(0)
    var tail = root

    for (node in lists) {
        if (node != null) {
            pq.add(node)
        }
    }

    while (!pq.isEmpty()) {
        tail.next = pq.poll()
        tail = tail.next

        if (tail.next != null) {
            pq.add(tail.next)
        }
    }

    return root.next
}