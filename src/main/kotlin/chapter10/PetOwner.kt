package chapter10

class PetOwner<T: Pet>(t: T) {

    val pets = mutableListOf<T>()

    fun add(pet: T) {
        pets.add(pet)
    }

    fun remove(pet: T) {
        pets.remove(pet)
    }

    fun main(args: Array<String>) {
        val catFuzz = Cat("Fuzz Lightyear")
        val catKatsu = Cat("Katsu")
        val fishFunny = Fish("Finny McGraw")
        val catOwner = PetOwner<Cat>(catFuzz)
        catOwner.add(catKatsu)
    }
}