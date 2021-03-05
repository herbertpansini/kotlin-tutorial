fun main() {
    val names = arrayOf("Jim", "John", "Jenny", "Jamie")
    for (name in names) println(name)

    for(i in 1..10) println(i)

    for (i in 1 until 10) println(i)

    for (i in 10 downTo 1) println(i)

    for (i in 'a'..'z' step 2) println(i)
}