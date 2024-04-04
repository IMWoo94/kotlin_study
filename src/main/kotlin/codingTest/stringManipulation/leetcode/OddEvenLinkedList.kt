package codingTest.stringManipulation.leetcode

import codingTest.stringManipulation.common.ListNode

fun oddEvenList(head: ListNode?): ListNode? {
    if (head == null)
        return null

    var odd = head
    var even = head.next
    var evenHead = even

    while (even?.next != null) {
        odd!!.next = odd.next!!.next
        even.next = even.next!!.next

        odd = odd!!.next
        even = even!!.next
    }

    odd!!.next = evenHead
    return head
}