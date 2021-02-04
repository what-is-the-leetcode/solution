import search_insert_position_35.Solution

fun main() {
    val testSet1: List<IntArray> = listOf(intArrayOf(1, 3, 5, 6), intArrayOf(1, 3, 5, 6), intArrayOf(1, 3, 5, 6),
            intArrayOf(1, 3, 5, 6), intArrayOf(1))
    val testSet2: List<Int> = listOf(5, 2, 7, 0, 0)

    for ((i, `val`) in testSet2.withIndex()) {
        println(Solution().searchInsert(testSet1[i], `val`))
    }
}