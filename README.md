# Kotlin Oreilly

There are some codes from book Head First Kotlin Oreilly
I really suggest this book for everyone who would like to start write Kotlin code

The book is divided into 12 chapters. There is my own summary on each chapter

# Chapter 1. Basic Kotlin
At the first chapter this book describes basic of Kolin
like main method which is very similar to main method from Java.
```
fun main(args: Array<String>) {
    ...
}
```
Above is basic Kotlin main method or entry point of the
whole program
The next topic in this chapter is data types.
Kotlin has next data types:
1. Int
2. Byte
3. Short
4. Long
5. Double
6. Float
   One of the coolest feature of the Kotlin that compiler can determine data types without declaration of type
   Kotlin also has loops like java - for example while and for
```
while (x < 5) {
    ...
}

for (i in 1..10) { //Have to remember first inclusive, the last one exclusive
    ...
}
```
if-else-if branching is too simple topic to describe it here, that is why we skip it.
There is one of my favourite feature - it is string template. For example you would like to print name of user:
```
fun main(args: Array<String>) {
    val name = readLine()
    println("The name of user is ${name})
}
```
# Chapter 2. Basic Kotlin

At this chapter I have learned more about arrays.
The work with arrays is pretty similar how you work with java arrays
Also in this chapter I have learned about random numbers.
The random numbers usage is widely spread in cryptography

The last but not least - you can convert data types to desired data types
just by calling method of object instance

# Chapter3
This chapter covered topics like string comparison,
reading input from console. It very fun game to play, but
there is no more knowledge if we compare with previous chapters

# Chapter 4
This chapter covered the next topics - constructors,
object methods and fields.

Typically, constructor created by the compiler because
when we start to write our class we have something like that
```
class Dog (val name: String, var weightParam: Int, var breed_param: String) {}
```
It is class with name Dog and next fields:
1. String name
2. Int weightParam
3. String breed_param

But we have some drawback here we cannot do something inside constructor.
I know it is bad idea...but actually we can do something like that:
```
    init {
        println("Dog $name has been created...")
    }

    var activities = arrayOf("Walks")
```

This init block will be executed when constructor.
You can have any numbers of init blocks they will execute in the same order that you
declare inside the class

# Chapter 5
I have learned from this chapter about inheritance and
overriding methods in daughter classes.

For tell compiler that we would like that this class should
be extensible we have to put keyword open before class keyword
```
open class Animal {}
```
The same rule is for variables and methods that you would
like to override in daughters classes
```
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10
```

For overriding open method you have to write keyword
override before method signature
```
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
```

# Chapter 6
In this chapter I got knowledge about abstract classes
and abstract variables.
If you would like to declare class abstract you have to add
abstract keyword
```
abstract class Animal {}
```
It means that you cannot create instance of this class.
You have to extend this class.
Also, from this chapter I get known what is interface in Kotlin
```
interface Roamable {

    fun roam() {
        println("The Roamable is roaming")
    }
}
```
Interface like a contract between two systems. Both system have to
be consistent with interface and follow rules by this interface
Kotlin as Java do not allow multiple inheritance, but we can implement many interfaces
If you would like to declare that some class implement interface you have to add
name of interface like this:
```
class Vehicle: Roamable {
    override fun roam() {
        println("The vehicle is roaming")
    }
}
```

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

# Chapter 8
This chapter covered topics like safety call of nullable object.
By default all object is not nullable in Kotlin, but we can declare
nullable objects for this you just have to add ? at the end of declared data type
```
var w: Wolf? = Wolf()
```

Now variable w is nullable. For work with nullable variable Kotlin has next feature
```
var x = wolf?.hunger
println("The value of x is ${x}")
```
If object wolf is null then it will not try to get hunger variable from this object.
Actually we can combine a few ? operators and if at least one is null all operation will be aborted.
```
var horsePower = myCar?.engine?.horsePower
```
But what if we would like to do something more complex with nullable object.
Kotlin has offered for us let block which works similar way as ? operator but we
can do some complex code inside let block
```
class MyDuck(var myDucks: Array<Duck?>) {
    fun quack() {
        for (duck in myDucks) {
            duck?.let {
                duck.quack()
            }
        }
    }
}
```