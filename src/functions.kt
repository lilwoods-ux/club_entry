//functions are reusable blocks of code that perform a specific task
//simple function / named function
fun greet(){
    println("hello from the name function")
}
//function with parameters
fun greet_with_parameters(name: String){
    name.uppercase()
    println("hello from the params function : $name")
}
//function with a 'return' value
fun add(a: Int, b:Int): Int{
    return a + b
}
//functions with default arguments
fun subtract(a: Int = 10, b:Int = 10): Int {
    return b - a
}

fun main(){
    greet()//invoking function
    greet_with_parameters("joseph")//invoking functions wit params
    greet_with_parameters("jonte")
    val sum = add(5,3)
    println(sum)
    val diff = subtract(20,20)
    println(diff)
}