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