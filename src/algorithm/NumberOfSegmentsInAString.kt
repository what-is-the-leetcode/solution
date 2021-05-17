package algorithm

class NumberOfSegmentsInAString {
    fun countSegments(s: String): Int {
        return s.trim().split(' ').map { tmp -> tmp.trim() }.filter { tmp -> tmp.isNotBlank() }.count()
    }
}