package implement_str_str_28

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }
        return haystack.indexOf(needle)
    }
}