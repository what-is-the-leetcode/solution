import remove_element_27.Solution

fun main() {
    val testSet1: List<IntArray> = listOf(intArrayOf(3, 2, 2, 3), intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), intArrayOf())
    val testSet2: List<Int> = listOf(3, 2, 0)

    for ((i, `val`) in testSet2.withIndex()) {
        println(Solution().removeElement(testSet1[i], `val`))
        println(testSet1[i].contentToString())
    }
}