package chapter9

fun main(args: Array<String>) {
    val petLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    var petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val pets = mutableSetOf<String>()
    pets.addAll(petLiam.toSet())
    pets.addAll(petsSophia.toSet())
    pets.addAll(petsNoah.toSet())
    pets.addAll(petsEmily.toSet())
    println(pets)
    println(pets.size)
}