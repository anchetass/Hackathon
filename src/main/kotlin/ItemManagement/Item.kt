package ItemManagement

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


}