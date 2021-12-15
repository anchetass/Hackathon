package ItemManagement

/**
 *  Interface for the required attributes for Items...
 */

interface ItemsInterface {
    val itemID: String
    val itemName: String
    var stocks: Int
    val category: ItemCategory
}