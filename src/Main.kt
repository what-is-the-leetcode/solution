import algorithm.*

fun main() {

    val node1st = ListNode(1)
    val node2nd = ListNode(2)
    val node3rd = ListNode(3)
    val node4th = ListNode(3)
    val node5th = ListNode(2)
//    val node6th = ListNode(1)

    node1st.next = node2nd
    node2nd.next = node3rd
    node3rd.next = node4th
    node4th.next = node5th
//    node5th.next = node6th

//    val node1st = TreeNode(2)
//    val node2nd = TreeNode(1)
//    val node3rd = TreeNode(3)
//
//    node1st.left = node2nd
//    node1st.right = node3rd


    println(PalindromeLinkedList().isPalindrome(ListNode(1)))
}