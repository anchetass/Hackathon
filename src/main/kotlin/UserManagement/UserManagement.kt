package UserManagement

import adminUI

fun login(username: String, password: String): String{
    for(user in User.adminList){
        if(user.username == username && user.password == password) return "admin"
    }
    for(user in User.staffList){
        if(user.username == username && user.password == password) return "staff"
    }
    return "404"
}

fun promptUserRegistration(admin: Admin){
    var passwordSuccess = false
    print("First Name: ")
    var firstName = readLine()!!
    print("Last Name: ")
    var lastName = readLine()!!
    print("Username: ")
    var username = readLine()!!
    var password = ""
    while(!passwordSuccess){
        val regex = """^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[${'$'}#@]).{6,16}${'$'}""".toRegex()
        print("Password: ")
        password = readLine()!!
        if (regex.matches(password)){
            println("Your password is accepted.\n")
            passwordSuccess = true
        } else {
            println("Your password is invalid.\n")
        }
    }

    var roleSuccess = false
    while(!roleSuccess){
        var isAdmin = false
        println("1. Admin\n2. Staff")
        print("Choose a Role: ")
        var role = readLine()!!
        when (role) {
            "1" -> {
                isAdmin = true
                admin.addUser(Admin(firstName,lastName,isAdmin,username,password))
                roleSuccess = true
            }
            "2" -> {
                isAdmin = false
                admin.addUser(Staff(firstName,lastName,isAdmin,username,password))
                roleSuccess = true
            }
            else -> println("Invalid input.\n")
        }
    }
    println()
    User.getEmployees()
    adminUI(admin)
}

fun promptRemoveUser(admin: Admin){
    var checkId = false
    while (!checkId) {
        println("Please enter the employee ID of the user to be removed:")
        var employeeId = readLine()!!
        if(!admin.removeUser(employeeId)) println("Employee ID not found!\n")
        else {
            checkId = true
            println("Employee with ID# $employeeId has been removed!\n")
        }
    }

    User.getEmployees()
    adminUI(admin)
}
