package ItemManagement

import UserManagement.User

/**
 * This class shows the attributes of Items as well as
 * the methods that is related to the "items" class
 */

class Item (
    override val itemID: String,
    override val itemName: String,
    override var stocks: Int,
    override val category: ItemCategory
    ): ItemsInterface {

    // This method gets the item from the item list by its name using a string parameter
    private fun getItem(name: String): Item {
        return ItemList().itemList.find { it.itemName.lowercase() == name.lowercase() }!!
    }

    //Method that would add specific number of stocks to a specific item
    fun restockItem (itemName: String, quantity: Int ) {
        val item = getItem(itemName)
        item.stocks = item.stocks + quantity
    }
    //Method that would subtract specific number of stocks to a specific item
    fun consumeItem (itemName: String, quantity: Int) {
        val item = getItem(itemName)
        if (item.stocks >= quantity) {
            item.stocks = item.stocks - quantity
        }
        else {
            throw IllegalArgumentException ("Insufficient Stocks")
        }
    }
    //Method that would add specific item to the item list
    fun registerItem (itemName: String, user: User) {
        val item = getItem(itemName)
        if (user.isAdmin) {
            ItemList().itemList.add(item)
            println("${item.itemName} is added to the inventory monitoring")
        }
        else {
            throw IllegalAccessException ("You don't have the permission to do this")
        }
    }
    //Method that would remove specific item to the item list
    fun removeItem (item: String, user: User) {
        val item = getItem(itemName)
        if (user.isAdmin) {
            ItemList().itemList.remove(item)
            println("${item.itemName} has been removed to the inventory monitoring")
        }
        else {
            throw IllegalAccessException ("You don't have the permission to do this")
        }
    }
}