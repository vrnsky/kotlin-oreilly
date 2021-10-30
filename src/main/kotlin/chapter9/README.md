# Chapter 9
This chapter cover collections. In kotlin the most of the collections are 
immutable, but if you would like to use mutable implementation you can specify it.

```
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
```

Example of Map interface:
```
val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
println("mRecipeMap original: $mRecipeMap")
val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
```