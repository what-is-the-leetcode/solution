import merge_two_sorted_lists_21.ListNode
import merge_two_sorted_lists_21.Solution

fun main() {
    val tmp = ListNode(4)
    val tmp2 = ListNode(2)
    tmp2.next = tmp
    val tmp3 = ListNode(1)
    tmp3.next = tmp2

    val ttmp = ListNode(4)
    val ttmp2 = ListNode(3)
    ttmp2.next = ttmp
    val ttmp3 = ListNode(1)
    ttmp3.next = ttmp2

    println(Solution().mergeTwoLists(tmp3, ttmp3))
}