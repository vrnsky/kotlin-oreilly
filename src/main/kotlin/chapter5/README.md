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