import ItemManagement.ItemList
import ItemManagement.ItemManagement

fun main(args: Array<String>) {
    ItemList().generateItems()
    ItemManagement().displayFrozenGoods()
    ItemManagement().consumeItem("BearBrand", 5)
    ItemManagement().displayDairy()
}