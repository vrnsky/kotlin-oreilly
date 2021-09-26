package drum

import kotlinx.coroutines.delay
import java.io.File
import javax.sound.sampled.AudioSystem

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(
            file
        )
    )
    clip.open(audioInputStream)
    clip.start()
}

suspend fun main() {
    playBeats("x-x-x-x-x-x-", "/Users/vrnsky/IdeaProjects/kotlin-oreilly/src/main/kotlin/drum/toms.aiff")
    playBeats("x-----x-----", "/Users/vrnsky/IdeaProjects/kotlin-oreilly/src/main/kotlin/drum/crash_cymbal.aiff")
}