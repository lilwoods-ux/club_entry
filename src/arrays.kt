// arrays are used to store multiple values in a single variable
//create an arrays using arrayOF() , ListOF()
var car_s = arrayOf("volvo","BMW","mazda",0, arrayOf("toyota","toyota X"))
// accessing elements inside of an array
// we can access an element by referring to the index number inside []'s
// index position starts from 0
fun main(){
    println(car_s[1])//access element in array
    //changing an element and reassign its value
    car_s[3] = "toyota"
    car_s[4]= "toyota X"
    println(car_s)
    // ro know the number f elements in  an array use the .size method
    println(car_s.size)// 5
    //checking if an element exists i an array
    //use the 'in' operator
    if ("jeep" in car_s){
        println("it exists")
    }
    else{
        println("it does not exist")
    }
    //looping/transversing an array ,forEach , for loop
    for(x in car_s){
        println(x)
    }
}