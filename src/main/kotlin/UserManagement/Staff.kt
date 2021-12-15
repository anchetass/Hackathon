package UserManagement

/**
 * This class shows the attributes of Staff as well as
 * the functions that is related to the "staff" class
 */

class Staff (
    override var firstName: String,
    override var lastName: String,
    override var isAdmin: Boolean,
    var username: String,
    var password: String
): User (firstName, lastName, isAdmin) {
    override var employeeId: String = ""

    /**
     *  init method to generate a unique ID for the staff users.
     */


    init {
        this.employeeId = "STF-${firstName.substring(0, 2).uppercase()}-${
            lastName.substring(0, 2).uppercase()
        }-${(adminList.size.plus(1))}"
    }
}
