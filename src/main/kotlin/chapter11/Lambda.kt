package chapter11

fun main(args: Array<String>) {
    var addFile = { x: Int -> x + 5 }
    println("Pass 6 to add five ${addFile(6)}")

    var addInts = { x: Int, y: Int -> x + y }
    var result = addInts(6, 7)
    println("Pass 6, 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { x -> x + 7 }
    println("Pass 12 to addSeven ${addSeven(12)}")

    var myLambda: () -> Unit = { println("Hi! I am Lambda") }
    myLambda()

    convert(20.0) {c: Double -> c * 1.8 + 32}
    convertFile {c: Int -> c * 1.8 + 32}
}

fun convert(x: Double, converter: (Double) -> Double) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFile(converter: (Int) -> Double) : Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}