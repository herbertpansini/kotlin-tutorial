fun main() {
    for (i in 1..10) {
        val prefix = if (i == 1) {
            "*"
        } else if (i !in 4..7) {
            "-"
        } else {
            println("-")
            ">"
        }
        println("$prefix $i")
    }
}