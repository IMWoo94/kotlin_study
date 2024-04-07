package codingTest.stringManipulation.leetcode

class DesignCircularDeque(k: Int) {

    data class DoublyLinkedList(var `val`: Int) {
        var left: DoublyLinkedList? = null
        var right: DoublyLinkedList? = null
    }

    var len = 0
    var k = 0
    var head: DoublyLinkedList? = null
    var tail: DoublyLinkedList? = null

    init {
        head = DoublyLinkedList(0)
        tail = DoublyLinkedList(0)

        head!!.right = tail
        tail!!.left = head

        this.k = k
        len = 0
    }

    fun insertFront(value: Int): Boolean {
        if (isFull()) {
            return false
        }
        val node = DoublyLinkedList(value)
        node.right = head!!.right
        node.left = head
        head!!.right!!.left = node
        head!!.right = node
        len++
        return true
    }

    fun insertLast(value: Int): Boolean {
        if (isFull()) {
            return false
        }
        val node = DoublyLinkedList(value)
        node.left = tail!!.left
        node.right = tail
        tail!!.left!!.right = node
        tail!!.left = node
        len++
        return true
    }

    fun deleteFront(): Boolean {
        if (isEmpty()) {
            return false
        }

        head!!.right!!.right!!.left = head
        head!!.right = head!!.right!!.right
        len--
        return true
    }

    fun deleteLast(): Boolean {
        if (isEmpty()) {
            return false
        }

        tail!!.left!!.left!!.right = tail
        tail!!.left = tail!!.left!!.left
        len--
        return true
    }

    fun getFront(): Int {
        if (isEmpty()) {
            return -1
        }
        return head!!.right!!.`val`
    }

    fun getRear(): Int {
        if (isEmpty()) {
            return -1
        }
        return tail!!.left!!.`val`
    }

    fun isEmpty(): Boolean {
        return len == 0
    }

    fun isFull(): Boolean {
        return len == k
    }

}