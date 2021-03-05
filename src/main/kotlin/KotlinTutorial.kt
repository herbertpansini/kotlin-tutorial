fun main() {
    val time = 10

    when (time) {
        in 0..11 -> println("Good morning!")
        12 -> println("Time for lunch!")
        else -> println("Good day!")
    }
}