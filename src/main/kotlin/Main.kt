fun main(args: Array<String>) {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")


    var accountType = ""
    var accountBalance = (1..1000).random()
    val money = (1..1000).random()
    var output = 0



    while (accountType == "") {
        println("Choose an option (1, 2 or 3): ")
        var userChoice = readLine()?.toInt()
        accountType = when (userChoice) {
            1    -> "Debit"
            2    -> "Credit"
            3    -> "Checking"
            else -> continue
        }
    }
    println("You have chosen to create a $accountType account.")


    println("\n Your account balance is \$$accountBalance.")
    println("the account balance and amount to be deposited/withdrawn is \$$money.")

}