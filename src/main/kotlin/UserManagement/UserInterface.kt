package UserManagement

/**
 *  Interface for the required attributes for Users.
 */

interface UserInterface {
    val employeeId: String
    val firstName: String
    val lastName: String
    val isAdmin: Boolean
}