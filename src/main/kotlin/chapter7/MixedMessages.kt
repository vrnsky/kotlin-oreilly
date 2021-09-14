package chapter7

data class Movie(val title: String, val year: String)

data class Song(val title: String, val artist: String)

fun main(args: Array<String>) {
    val m1 = Movie("Black Panther", "2018")
    var m2 = Movie("Jurassic World", "2015")
    val m3 = Movie("Jurassic World", "2015")
    val s1 = Song("Love Cats", "The Cure")
    val s2 = Song("Wild Horses", "The Rolling Stones")
    val s3 = Song("Love Cats", "The Cure")

    println("1st")
    println(m2 == m3)
    println("2st")
    println(s1 == s3)
    println("3rd")
    val m4 = m1.copy()
    println(m1 == m4)
    println("5th")
    val m5 = m1.copy()
    println(m1 === m5)
    println("6th")
    val m6 = m2
    m2 = m3
    println(m3 == m6)
}