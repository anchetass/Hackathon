package UserManagement

fun login(username: String, password: String): String{
    for(user in User.adminList){
        if(user.username == username && user.password == password) return "admin"
    }
    for(user in User.staffList){
        if(user.username == username && user.password == password) return "staff"
    }
    return "Invalid User"
}