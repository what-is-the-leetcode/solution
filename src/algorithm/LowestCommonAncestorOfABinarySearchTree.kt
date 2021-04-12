package algorithm

/**
 * ref.: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/discuss/64963/3-lines-with-O(1)-space-1-Liners-Alternatives
 */
class LowestCommonAncestorOfABinarySearchTree {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        return if ((root!!.`val` - p!!.`val`) * (root.`val` - q!!.`val`) < 1) root else lowestCommonAncestor(if (p.`val` < root.`val`) root.left else root.right, p, q)
    }
}