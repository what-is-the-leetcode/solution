import algorithm.ListNode
import algorithm.RemoveLinkedListElements

fun main() {
    val node1st = ListNode(1)
    val node2nd = ListNode(5)
    node2nd.next = node1st
    val node3rd = ListNode(4)
    node3rd.next = node2nd
    val node4th = ListNode(3)
    node4th.next = node3rd
    val node5th = ListNode(6)
    node5th.next = node4th
    val node6th = ListNode(2)
    node6th.next = node5th
    val node7th = ListNode(1)
    node7th.next = node6th

    val node8th = ListNode(6)
    node8th.next = node7th

    println(RemoveLinkedListElements().removeElements(node8th, 6))
}