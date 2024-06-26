package codingTest.stringManipulation.leetcode

class DesignHashMap() {

    class Node(var key: Int, var `var`: Int) {
        var next: Node? = null
    }

    val nodes: Array<Node?> = arrayOfNulls(1000000)

    fun put(key: Int, value: Int) {
        var index: Int = key % nodes.size
        if (nodes[index] == null) {
            nodes[index] = Node(key, value)
            return
        }

        // 인덱스에 노드가 존재하면
        var node = nodes[index]
        while (node != null) {
            if (node.key == key) {
                node.`var` = value
                return
            }
            if (node.next == null) {
                break
            }
            node = node.next
        }
        node!!.next = Node(key, value)
    }

    fun get(key: Int): Int {
        val index = key % nodes.size

        if (nodes[index] == null) {
            return -1
        }

        var node = nodes[index]
        while (node != null) {
            if (node.key == key) {
                return node.`var`
            }
            node = node.next
        }
        return -1
    }

    fun remove(key: Int) {
        val index = key % nodes.size

        if (nodes[index] == null) {
            return
        }

        var node = nodes[index]
        if (node!!.key == key) {
            if (node.next == null) {
                nodes[index] = null
            } else {
                nodes[index] = node.next
            }
        }

        var prev = node
        while (node != null) {
            if (node.key == key) {
                prev!!.next = node.next
                return
            }
            prev = node
            node = node.next
        }
    }

}