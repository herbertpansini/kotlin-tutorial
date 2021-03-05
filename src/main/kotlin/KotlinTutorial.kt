fun main() {
    var i = 0

    do {
        println(i)
        i++
        continue
        var j = 0
        while (j < 5) {
            println("----$j")
            j++
            break
            println("I'm not printed")
        }
        println("I'm printed")
    } while (i < 5)
}