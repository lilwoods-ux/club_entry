
fun main() {
    println("welcome to the club entry system")
    print("please enter your name:")
    val name = readln()
    print("enter your age:")
    val age = readln().toIntOrNull() ?: 0

    when {
        age <= 18 -> {
            println("NO ENTRY!!")

        }

        else -> {
            print("Do You Have A VIP Pass? (yes/no)")
            val hasVipPass = readln().equals("yes", ignoreCase = true)
            println("WELCOME TO OUR CLUB!!")

            when {
                hasVipPass -> {
                    println("WELCOME OUR VIP")

                }

                else -> {

                    print("please enter your members number:")
                    val membersnumber = readln().toIntOrNull() ?: 0
                    println("Drink discount,member $membersnumber")
                }


            }
        }
    }
    println(name)
    println (age)
}