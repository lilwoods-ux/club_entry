
fun main() {
    println("welcome to the club entry system")
    print("please enter your name:")
    val name = readln()
    print("enter your age:")
    val age = readln().toIntOrNull() ?: 0
    print("Do You Have A VIP Pass? (yes/no)")
    val hasVipPass = readln().equals("yes", ignoreCase = true)
    print("Are you a member? (yes/no)")
    val ismember = readln().equals("yes", ignoreCase = true)
    if (age <= 18) {
        println("NO ENTRY!!")
    } else {
        println("WELCOME TO OUR CLUB!!")

        if (hasVipPass) {
            println("WELCOME OUR VIP")

        } else {
            print("please enter your members number:")
            val membersnumber = readln().toIntOrNull() ?: 0
            println("Drink discount,member $membersnumber")
        }
        println(name)
        println(age)
        println(hasVipPass)
        println(ismember)
    }
}