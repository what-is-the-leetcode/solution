package algorithm

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        for (i in 0 until n) {
            nums1[m + i] = nums2[i]
        }
        nums1.sort()
//        println(nums1.contentToString())
    }
}