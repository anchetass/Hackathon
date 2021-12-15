package ItemManagement

import UserManagement.User

class ItemManagement {

    // This method gets the item from the item list by its name using a string parameter
    private fun getItem(name: String): Item {
        return ItemList.items.find { it.itemName.lowercase() == name.lowercase() }!!
    }

    //Method that would add specific number of stocks to a specific item
    fun restockItem (itemName: String, quantity: Int ) {
        val item = getItem(itemName)
        item.stocks = item.stocks + quantity
        println("$quantity piece(s) of ${item.itemName} has been restocked to the inventory")
    }
    //Method that would subtract specific number of stocks to a specific item
    fun consumeItem (itemName: String, quantity: Int) {
        val item = getItem(itemName)
        if (item.stocks >= quantity) {
            item.stocks = item.stocks - quantity
            if (item.stocks < ItemList.buffer) {
                println("$quantity piece(s) of ${item.itemName} has been checked out. There's only ${item.stocks} of ${item.itemName} left. Please restock immediately")
            }
            else {
                println("$quantity piece(s) of ${item.itemName} has been checked out")
            }
        }
        else {
            throw IllegalArgumentException ("Insufficient Stocks")
        }
    }
    //Method that would add specific item to the item list
    fun registerItem (itemName: String, user: User) {
        val item = getItem(itemName)
        if (user.isAdmin) {
            ItemList.items.add(item)
            println("${item.itemName} is added to the inventory monitoring")
        }
        else {
            throw IllegalAccessException ("You don't have the permission to do this")
        }
    }
    //Method that would remove specific item to the item list
    fun removeItem (itemName: String, user: User) {
        val item = getItem(itemName)
        if (user.isAdmin) {
            ItemList.items.remove(item)
            println("${item.itemName} has been removed to the inventory monitoring")
        }
        else {
            throw IllegalAccessException ("You don't have the permission to do this")
        }
    }
    fun displayFrozenGoods () {
        val frozenGoods = mutableMapOf<String, Int>()
        ItemList().frozenGoodList().forEach {
            frozenGoods[it.itemName] = it.stocks
        }
        println(frozenGoods)
    }
    fun displayDairy () {
        val dairy = mutableMapOf<String, Int>()
        ItemList().dairyList().forEach {
            dairy[it.itemName] = it.stocks
        }
        println(dairy)
    }
    fun displayCanned () {
        val canned = mutableMapOf<String, Int>()
        ItemList().cannedList().forEach {
            canned[it.itemName] = it.stocks
        }
        println(canned)
    }
    fun displayAlcohol () {
        val alcohol = mutableMapOf<String, Int>()
        ItemList().alcoholList().forEach {
            alcohol[it.itemName] = it.stocks
        }
        println(alcohol)
    }
    fun displayCleaning () {
        val cleaning = mutableMapOf<String, Int>()
        ItemList().cleaningList().forEach {
            cleaning[it.itemName] = it.stocks
        }
        println(cleaning)
    }
}