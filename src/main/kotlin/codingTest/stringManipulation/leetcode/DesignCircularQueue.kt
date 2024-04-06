package codingTest.stringManipulation.leetcode

class DesignCircularQueue(k: Int) {

    var q: IntArray = IntArray(k)
    var front = 0
    var rear = -1
    var len = 0

    fun enQueue(value: Int): Boolean {
        return if (!isFull()) {
            this.rear = (this.rear + 1) % this.q.size
            this.q[rear] = value
            this.len++
            true
        } else {
            false
        }
    }

    fun deQueue(): Boolean {
        return if (!isEmpty()) {
            this.front = (this.front + 1) % this.q.size
            this.len--
            true
        } else {
            false
        }
    }

    fun Front(): Int {
        return if (this.isEmpty()) {
            -1
        } else {
            q[front]
        }
    }

    fun Rear(): Int {
        return if (this.isEmpty()) {
            -1
        } else {
            q[rear]
        }
    }

    fun isEmpty(): Boolean {
        return this.len == 0
    }

    fun isFull(): Boolean {
        return this.len == q.size
    }
}