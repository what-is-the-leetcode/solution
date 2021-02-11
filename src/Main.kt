import algorithm.BinaryTreeLevelOrderTraversalII
import algorithm.MergeSortedArray
import algorithm.TreeNode

fun main() {
    val t1 = TreeNode(15)
    val t2 = TreeNode(7)

    val t3 = TreeNode(9)
    val t4 = TreeNode(20)
    t4.left = t1
    t4.right = t2

    val root = TreeNode(3)
    root.left = t3
    root.right = t4

    println(BinaryTreeLevelOrderTraversalII().levelOrderBottom(root))
}