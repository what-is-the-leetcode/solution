import roman_to_integer_13.Solution

fun main() {
    val testSet: List<String> = listOf("III", "IV", "IX", "LVIII", "MCMXCIV")

    for (test in testSet) {
        println(Solution().romanToInt(test))
    }
}