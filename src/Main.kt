import algorithm.IntersectionOfTwoLinkedLists
import algorithm.ListNode

fun main() {
    val tmp1 = ListNode(2)
    val tmp2 = ListNode(6)
    val tmp3 = ListNode(4)

    val rmp1 = ListNode(1)
    val rmp2 = ListNode(5)

    tmp1.next = tmp2
    tmp2.next = tmp3

    rmp1.next = rmp2

    println(IntersectionOfTwoLinkedLists().getIntersectionNode(tmp1, rmp1))
}