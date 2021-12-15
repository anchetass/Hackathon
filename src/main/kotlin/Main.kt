import UserManagement.Admin
import UserManagement.Staff
import UserManagement.User


fun main(args: Array<String>) {
    val superAdmin = Admin( "Justin", "Macki", true, "justinmacki", "1234")
    superAdmin.addUser(superAdmin)
    initiateSystem(superAdmin)
}

fun adminUI(superAdmin: Admin) {
    println("Please choose a transaction below: ")
    println("1. Register new user\n2. Remove a User\n3. View Admins\n4. View Staff\n5. View Employees\n6. Logout")
    print("Enter the number: ")
    var choice = readLine()!!.toInt()
    println()

    when (choice) {
        1 -> {
            UserManagement.promptUserRegistration(superAdmin)
        }
        2 -> {
            UserManagement.promptRemoveUser(superAdmin)
        }
        3 -> {
            User.displayAdmins()
            println()
            adminUI(superAdmin)
        }
        4 -> {
            User.displayStaff()
            println()
            adminUI(superAdmin)
        }
        5 -> {
            User.getEmployees()
            println()
            adminUI(superAdmin)
        }
        6 -> {
            initiateSystem(superAdmin)
        }
        else -> {
            println("Invalid input.\n")
            adminUI(superAdmin)
        }
    }
    println()
}

fun initiateSystem(superAdmin: Admin){
    try{
        println("Hello! Please enter your credentials below.")
        print("Username: ")
        val username = readLine()!!
        print("Password: ")
        val password = readLine()!!
        println()

        if(UserManagement.login(username,password) == "admin") {
            println("WELCOME ADMIN")
            adminUI(superAdmin)
        }
        if(UserManagement.login(username,password) == "staff"){
            println("WELCOME STAFF")
        }
        if(UserManagement.login(username,password) == "404"){
            println("USER DOES NOT EXIST")
            println()
            initiateSystem(superAdmin)
        }

    }catch (e: Exception){
        println("Oops! We encountered a problem!")
    }
}






