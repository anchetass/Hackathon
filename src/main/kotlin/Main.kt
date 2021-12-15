import UserManagement.Admin
import UserManagement.Staff
import UserManagement.User


fun main(args: Array<String>) {
//    val superAdmin = Admin( "Justin", "Macki", true)
//    superAdmin.addUser(superAdmin)
//    val manager = Admin( "Shelly", "Ancheta", true)
//    superAdmin.addUser(manager)
//    val staff1 = Staff( "Keme", "Etc", false)
//    manager.addUser(staff1)
//    val staff2 = Staff( "Haha", "Etc", false)
//    manager.addUser(staff2)
//
//    User.displayAdmins()
//    println()
//    User.displayStaff()
//    println()
//    User.getEmployees()
    try{
        println("Hello! Please enter your credentials below.")
        print("Username: ")
        val username = readLine()!!
        print("Password: ")
        val password = readLine()!!

        if(UserManagement.login(username,password) == "admin"){
            println("WELCOME ADMIN")
        }

    }catch (e: Exception){
        println("Oops! We encountered a problem!")
    }

}

