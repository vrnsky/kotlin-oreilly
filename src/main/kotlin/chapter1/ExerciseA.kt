package chapter1

fun main(args: Array<String>) {
    var x = 1

    while (x < 10) {
        if (x > 3) {
            println("big $x")
        }
        x += 1
    }
}