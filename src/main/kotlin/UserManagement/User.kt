package UserManagement

abstract class User(
    firstName: String,
    lastName: String,
    isAdmin: Boolean
) : UserInterface {

    companion object {
        var adminList = mutableListOf<Admin>()
        var staffList = mutableListOf<Staff>()

        /**
         * This function will display all admin users
         */
        fun displayAdmins() {
            adminList.forEach {
                with(it) {
                    println("$employeeId\t$firstName\t$lastName")
                }
            }
        }

        /**
         * This function will display all staff users
         */
        fun displayStaff() {
            staffList.forEach {
                with(it) {
                    println("$employeeId\t$firstName\t$lastName")
                }
            }
        }

        /**
         * This function will display all users
         */
        fun getEmployees() {
            adminList.forEach {
                with(it) {
                    println("$employeeId\t$firstName\t$lastName\t$isAdmin")
                }
            }

            staffList.forEach {
                with(it) {
                    println("$employeeId\t$firstName\t$lastName\t$isAdmin")
                }
            }
        }


    }

}