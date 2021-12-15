package ItemManagement

interface ItemsInterface {
    val itemID: String
    val itemName: String
    var stocks: Int
    val category: ItemCategory
}