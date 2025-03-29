//kotlin has the following conditionals
//1. use of if specify that a block of code if to be executed if a condition is true
//2. use of else to specify if the condition above is true
//3. when to specify many alternative
var a = 40
var b = 40
fun main(){
    if(a > b){
        println("$a is greater than $b")
    }
    else if(a < b){
        println("$a is less than $b")
    }
    else if(a == b){
        println("$a is equal to $b")
    }
    else{
        println("$a is not greater than $b")
    }

}