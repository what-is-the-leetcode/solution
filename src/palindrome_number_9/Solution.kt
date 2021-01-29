package palindrome_number_9

// https://leetcode.com/problems/palindrome-number/
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        if (x / 10 == 0) {
            return true
        }
        var virtualX = x
        val ten = 10
        var tmp = 0
        while (true) {
            val remainder: Int = virtualX % ten
            tmp = (tmp * ten) + remainder

            if (virtualX / ten == 0) {
                return x == tmp
            }
            virtualX /= ten
        }
    }
}