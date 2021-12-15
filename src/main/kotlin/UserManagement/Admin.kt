package UserManagement

class Admin(
    override var firstName: String,
    override var lastName: String,
    override var isAdmin: Boolean,
    var username: String,
    var password: String
): User (firstName, lastName, isAdmin) {
    override var employeeId: String = ""

    fun addUser(newEmployee: Admin){
        adminList.add(newEmployee)
    }

    fun addUser(newEmployee: Staff){
        staffList.add(newEmployee)
    }

    init {
        this.employeeId = "${firstName.substring(0,2).uppercase()}-${lastName.substring(0,2).uppercase()}-${(10000000 until 99999999).random()}"
    }
}