package ItemManagement

class ItemList () {
    init {

    }
    companion object {
        const val buffer = 10
        var items = mutableListOf<Item>()
    }
    fun generateItems () {
        items.add( Item("TenderJuicy Hotdog", 20, ItemCategory.FROZEN))
        items.add( Item("Pampanga's Best Tocino", 20, ItemCategory.FROZEN ))
        items.add( Item("Purefoods Nuggers", 20, ItemCategory.FROZEN ))
        items.add( Item("BearBrand", 20, ItemCategory.DAIRY ))
        items.add( Item("Anchor Butter", 20, ItemCategory.DAIRY ))
        items.add( Item("Eden Cheese", 20, ItemCategory.DAIRY ))
        items.add( Item("Ligo Sardines", 20, ItemCategory.CANNED ))
        items.add( Item("Argentina Meatloaf", 20, ItemCategory.CANNED ))
        items.add( Item("Purefoods CornedBeef", 20, ItemCategory.CANNED ))
        items.add( Item("Emperador", 20, ItemCategory.ALCOHOL ))
        items.add( Item("SanMig Pale Pilsen", 20, ItemCategory.ALCOHOL ))
        items.add( Item("Red Horse", 20, ItemCategory.ALCOHOL ))
        items.add( Item("Joy Dishwashing Liquid", 20, ItemCategory.CLEANING ))
        items.add( Item("Tide", 20, ItemCategory.CLEANING ))
        items.add( Item("Zonrox", 20, ItemCategory.CLEANING ))
    }

    fun frozenGoodList (): List<Item> {
        return items.filter { it.category == ItemCategory.FROZEN }
    }
    fun dairyList (): List<Item> {
        return items.filter { it.category == ItemCategory.DAIRY }
    }
    fun cannedList (): List<Item> {
        return items.filter { it.category == ItemCategory.CANNED }
    }
    fun alcoholList (): List<Item> {
        return items.filter { it.category == ItemCategory.ALCOHOL }
    }
    fun cleaningList (): List<Item> {
        return items.filter { it.category == ItemCategory.CLEANING }
    }

}