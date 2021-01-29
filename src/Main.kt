import palindrome_number_9.Solution

fun main() {
    val testSet: List<Int> = listOf(121, -121, 10, -101, 123, 101, -123, 10)

    for (test in testSet) {
        println(Solution().isPalindrome(test))
    }

}