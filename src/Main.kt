import algorithm.MinStack

fun main() {
    val obj = MinStack()
    obj.push(-2)
    obj.push(0)
    obj.push(-3)
    println(obj.getMin())
    obj.pop()
    println(obj.top())
    println(obj.getMin())
}