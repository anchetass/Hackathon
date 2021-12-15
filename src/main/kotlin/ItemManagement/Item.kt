package ItemManagement

import UserManagement.User

/**
 * This class shows the attributes of Items as well as
 * the methods that is related to the "items" class
 */

class Item (
    override val itemName: String,
    override var stocks: Int,
    override val category: ItemCategory
    ): ItemsInterface {
    override var itemID: String = ""

    init {
        this.itemID = "ITM-${(ItemList.items.size.plus(1))}"
    }
}