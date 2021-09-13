package chapter6

abstract class Appliance {
     var pluggedId = true
     abstract val color: String

     abstract fun consumePower()
}