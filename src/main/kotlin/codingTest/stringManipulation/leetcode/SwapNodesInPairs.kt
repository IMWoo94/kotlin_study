package codingTest.stringManipulation.leetcode

import codingTest.stringManipulation.common.ListNode


fun swapPairs(head: ListNode?): ListNode? {

    // 현재 노드와 다음 노드가 있는지 확인
    if (head?.next != null) {
        val p = head.next
        head.next = swapPairs(head.next!!.next)
        p!!.next = head
        return p
    }
    return head

}
