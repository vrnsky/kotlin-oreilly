package chapter4

class Song(val title: String, val artist: String) {

    fun play() {
        println("Song $title by $artist start playing")
    }

    fun stop() {
        println("Song $title by $artist stop playing")
    }
}

fun main(args: Array<String>) {
    val songOne = Song("1", "2")
    val songTwo = Song("3", "4")
    val songThree = Song("4", "5")
    songTwo.play()
    songOne.stop()
    songThree.play()
}