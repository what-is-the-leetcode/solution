import longest_common_prefix_14.Solution

fun main() {
    val testSet: List<Array<String>> = listOf(arrayOf("flower", "flow", "flight"), arrayOf("dog", "racecar", "car"), arrayOf(), arrayOf("", "car"))

    for (test in testSet) {
        println(Solution().longestCommonPrefix(test))
    }
}