fun main() {
    val names = arrayOf("Jim", "John", "Jenny")
    val str = arrayOf(1,  "Hi", 'b')
    str[0] = 'a'
    val numbers = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
    )

    println(numbers[1][1])

    names[0] = "Jeremy"

    println("Number of elements: ${names.size}")
    println("First element: ${names[0]}")
}