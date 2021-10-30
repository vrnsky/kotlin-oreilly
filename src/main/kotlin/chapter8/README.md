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