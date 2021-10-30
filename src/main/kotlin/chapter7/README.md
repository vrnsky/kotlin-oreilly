# Chapter 7
This chapter covered next topics:
1. Named and default parameters
2. Destruction of object 
3. Copy of the object

## Named and default parameters
If you have some experience in Python you know what it means
You can pass values to the method by its names
```
fun findRecipe(title: String = "",
               ingredient: String = "", isVegetarian: Boolean = false,
               difficulty: String = ""): Array<MyRecipe> {
    return arrayOf(MyRecipe(title, ingredient, isVegetarian, difficulty));
}
```
There is example of default and names parameters

## Destruction of object
For example you would like to print some fields of object.
In java you code something like that:
```
for (Dog dog : dogs) {
    System.out.println("Dog name: " + dog.getName());
}
```
but in Kotlin we can do it more properly way:
```
val r1 = MyRecipe("Thai Curry", "Chicken", false)
val (title, mainIngredient, vegetarian, difficulty) = r1
println("title is ${title} and vegetarian is ${vegetarian}")
```
How to copy object in Kotlin? You just have to call copy method()
If you would like to change some fields of copying object, you have to pass it to copy method
```
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
    val m4 = m1.copy(title = "Rrr")
    println(m1 == m4)
    println("5th")
    val m5 = m1.copy()
    println(m1 === m5)
    println("6th")
    val m6 = m2
    m2 = m3
    println(m3 == m6)
}
```