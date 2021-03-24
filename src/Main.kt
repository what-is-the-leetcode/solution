import algorithm.ListNode
import algorithm.ReverseLinkedList

fun main() {

    val node1st = ListNode(1)
    val node2nd = ListNode(2)
    val node3rd = ListNode(3)
    val node4th = ListNode(4)
    val node5th = ListNode(5)

    node1st.next = node2nd
    node2nd.next = node3rd
    node3rd.next = node4th
    node4th.next = node5th

//    println(ReverseLinkedList().reverseList(node1st))
    println(ReverseLinkedList().reverseList(null))

}