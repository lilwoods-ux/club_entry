package oop

class Person {
    //properties
    var name: String =""
    var age: Int = 0
    //methods
    fun speak(){
        println("hello , my name is $name,i'm $age")
    }
}
//kotlin provides a more concise way of declaring
//classes: classes declared using a constructor
class Vehicle{
    val model:String = ""
    val make : String = ""
    val yom : Int = 0
    fun identifyCar(){
        println("your car model is $model,it was made by $make in the year $yom")
    }
}
// create an object from above class
fun main(){
    val person1 = Person()
    val person2 = Person()
    person1.name = "joseph"
    person1.age = 28
    person1.speak()

    val vehicle1 = Vehicle()
    val vehicle2  = Vehicle()
}