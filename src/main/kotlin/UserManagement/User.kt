package UserManagement

abstract class User (
    override val employeeID: String,
    override val firstName: String,
    override val lastName: String,
    override val isAdmin: Boolean
) : UserManagement {
}