import valid_parentheses_20.Solution

fun main() {
    val testSet: List<String> = listOf("({{{{}}}))", "()", "()[]{}", "(]",  "([)]", "{[]}", "[", "]")

    for (test in testSet) {
        println(Solution().isValid(test))
    }
}