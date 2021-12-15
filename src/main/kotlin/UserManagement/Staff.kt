package UserManagement

class Staff (
    employeeId: String,
    firstName: String,
    lastName: String,
    isAdmin: Boolean
): User (employeeId, firstName, lastName) {

}