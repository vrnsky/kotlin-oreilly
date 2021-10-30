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
