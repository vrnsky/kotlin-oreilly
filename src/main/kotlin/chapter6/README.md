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
