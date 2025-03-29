//"content": strings to store text
// string contains a collection of characters surrounded by double quotations
var txt ="hello world"
//string concatenation
var firstname="Timothy"
var lastname="kip"
fun main(){
    //accessing a character in a string
    println(txt[4])
    //getting the length of the string
    println(txt.length)
    println(txt.uppercase())
    println(txt.lowercase())
    //+
    var fullname="my name is "+firstname+" "+lastname
    println(fullname)
    println("my name is $firstname $lastname")

}