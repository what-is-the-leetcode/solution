package algorithm

class InvertBinaryTree {
    private fun change(head: TreeNode?): TreeNode? {
        if (head == null) {
            return null
        }

        val left = head.left
        val right = head.right

        head.left = change(right)
        head.right = change(left)
        return head
    }

    fun invertTree(root: TreeNode?): TreeNode? {
        return change(root)
    }
}