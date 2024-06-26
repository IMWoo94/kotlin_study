package codingTest.stringManipulation.leetcode

import codingTest.stringManipulation.common.ListNode
import java.util.*

fun isPalindrome(head: ListNode?): Boolean {
    val deque: Deque<Int> = LinkedList();

    var node = head;
    while (node != null) {
        deque.add(node.`val`)
        node = node.next
    }

    while (!deque.isEmpty() && deque.size > 1) {
        if (deque.pollLast() != deque.pollFirst()) {
            return false;
        }
    }

    return true;
}