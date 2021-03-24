package algorithm

class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        val holder = mutableListOf<ListNode>()

        var currentNode = head
        while (currentNode != null) {
            holder.add(currentNode)
            currentNode = currentNode.next
        }

        for (i in (0 until holder.size).reversed()) {
            if (i == 0) {
                holder[i].next = null
            } else {
                holder[i].next = holder[i - 1]
            }
        }
        return if (holder.isEmpty()) null else holder.last()
    }
}