package algorithm

class RemoveLinkedListElements {
    private fun something(node: ListNode?, n: Int): ListNode? {
        if (node?.next == null) {
            return null
        }

        if (node!!.next!!.`val` == n) {
            node.next = node!!.next!!.next
            something(node, n)
        }
        return something(node.next, n)
    }

    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        something(head, `val`)
        if (head != null && head.`val` == `val`) {
            return head.next
        }
        return head
    }
}