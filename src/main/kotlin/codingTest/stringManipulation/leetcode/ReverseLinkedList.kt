package codingTest.stringManipulation.leetcode

import codingTest.stringManipulation.common.ListNode


fun reverseList(head: ListNode?): ListNode? {
    var node = head;
    var prev: ListNode? = null;

    while (node != null) {
        val next = node.next

        node.next = prev

        prev = node

        node = next

    }
    return prev
}
