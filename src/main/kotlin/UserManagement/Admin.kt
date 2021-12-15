package UserManagement

/**
 * This class shows the attributes of Admin as well as
 * the functions that is related to the "admin" class
 */

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

    fun removeUser(userId: String): Boolean{
        for(user in adminList){
            if(user.employeeId == userId){
                adminList.remove(user)
                return true
            }
        }

        for(user in staffList){
            if(user.employeeId == userId){
                staffList.remove(user)
                return true
            }
        }
        return false
    }

    init {
        this.employeeId = "ADM-${firstName.substring(0,2).uppercase()}-${lastName.substring(0,2).uppercase()}-${(adminList.size.plus(1))}"
    }
}
