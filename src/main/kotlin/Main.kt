import ItemManagement.ItemCategory
import UserManagement.Admin
import UserManagement.Staff
import UserManagement.User
import ItemManagement.ItemList
import ItemManagement.ItemManagement

fun main(args: Array<String>) {
    ItemList().generateItems()
    val superAdmin = Admin( "Justin", "Macki", true, "justinmacki", "1234")
    superAdmin.addUser(superAdmin)
    initiateSystem(superAdmin)
}

fun adminUI(superAdmin: Admin) {
    println("Please choose a transaction below: ")
    println("1. Register new user\n2. Remove a User\n3. View Admins\n4. View Staff\n5. View Employees\n6. Checkout Item/s\n7. Restock Item/s\n8. Display Available Stocks\n9. Add Item to Inventory\n10. Remove Item from Inveentory\n11. Logout")
    print("Enter the number: ")
    var choice = readLine()!!.toInt()
    println()

    when (choice) {
        1 -> {
            UserManagement.promptUserRegistration(superAdmin)
        }
        2 -> {
            UserManagement.promptRemoveUser(superAdmin)
        }
        3 -> {
            User.displayAdmins()
            println()
            adminUI(superAdmin)
        }
        4 -> {
            User.displayStaff()
            println()
            adminUI(superAdmin)
        }
        5 -> {
            User.getEmployees()
            println()
            adminUI(superAdmin)
        }
        6 -> {
            ItemManagement().displayAllItems()
            print("Please enter the Item Name: ")
            var itemName = readLine()!!
            print("Please enter quantity: ")
            var itemQuantity = readLine()!!.toInt()
            ItemManagement().consumeItem(itemName, itemQuantity)
            println()
            adminUI(superAdmin)
        }
        7 -> {
            ItemManagement().displayAllItems()
            print("Please enter the Item Name: ")
            var itemName = readLine()!!
            print("Please enter quantity: ")
            var itemQuantity = readLine()!!.toInt()
            ItemManagement().restockItem(itemName, itemQuantity)
            println()
            adminUI(superAdmin)
        }
        8 -> {
            ItemManagement().displayAllItems()
            println()
            adminUI(superAdmin)
        }
        9 -> {
            print("Please enter the Item Name: ")
            var itemName = readLine()!!
            println("(Frozen Goods, Canned, Cleaning, Dairy, Alcohol)")
            print("Please type the category: ")
            var category = readLine()!!
            print("Please enter initial stock quantity: ")
            var quantity = readLine()!!.toInt()
            ItemManagement().registerItem(itemName, category.lowercase(), quantity, superAdmin)
            println()
            adminUI(superAdmin)
        }
        10 -> {
            ItemManagement().displayAllItems()
            print("Please enter the Item Name: ")
            var itemName = readLine()!!
            ItemManagement().removeItem(itemName, superAdmin)
            println()
            adminUI(superAdmin)
        }
        11 -> {
            initiateSystem(superAdmin)
        }
        else -> {
            println("Invalid input.\n")
            adminUI(superAdmin)
        }
    }
    println()
}

fun staffUI(superAdmin: Admin){
    println("\nPlease choose a transaction below: ")
    println("1. Checkout Item/s\n2. Restock Item/s\n3. Display Available Stock/s\n4. Logout")
    print("Enter the number: ")
    var choice = readLine()!!.toInt()
    println()

    when (choice) {
        1 -> {
            ItemManagement().displayAllItems()
            print("Please enter the Item Name: ")
            var itemName = readLine()!!
            print("Please enter quantity: ")
            var itemQuantity = readLine()!!.toInt()
            ItemManagement().consumeItem(itemName, itemQuantity)
            staffUI(superAdmin)
        }
        2 -> {
            ItemManagement().displayAllItems()
            print("Please enter the Item Name: ")
            var itemName = readLine()!!
            print("Please enter quantity: ")
            var itemQuantity = readLine()!!.toInt()
            ItemManagement().restockItem(itemName, itemQuantity)
            staffUI(superAdmin)
        }
        3 -> {
            ItemManagement().displayAllItems()
            staffUI(superAdmin)
        }
        4 -> {
            initiateSystem(superAdmin)
        }
        else -> {
            println("Invalid input.\n")
            staffUI(superAdmin)
        }
    }
}

fun initiateSystem(superAdmin: Admin){
    try{
        println("Hello! Please enter your credentials below.")
        print("Username: ")
        val username = readLine()!!
        print("Password: ")
        val password = readLine()!!
        println()

        if(UserManagement.login(username,password) == "admin") {
            println("WELCOME ADMIN")
            adminUI(superAdmin)
        }
        if(UserManagement.login(username,password) == "staff"){
            println("WELCOME STAFF")
            staffUI(superAdmin)
        }
        if(UserManagement.login(username,password) == "404"){
            println("USER DOES NOT EXIST")
            println()
            initiateSystem(superAdmin)
        }

    }catch (e: Exception){
        println(e)
    }
}

