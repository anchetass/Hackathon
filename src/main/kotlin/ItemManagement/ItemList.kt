package ItemManagement

class ItemList () {
    init {

    }
    companion object {
        const val buffer = 10
        var items = mutableListOf<Item>()
    }
    fun generateItems () {
        items.add( Item("001A","TenderJuicy Hotdog", 20, ItemCategory.FROZEN))
        items.add( Item("001B","Pampanga's Best Tocino", 20, ItemCategory.FROZEN ))
        items.add( Item("001C","Purefoods Nuggers", 20, ItemCategory.FROZEN ))
        items.add( Item("002A","BearBrand", 20, ItemCategory.DAIRY ))
        items.add( Item("002B","Anchor Butter", 20, ItemCategory.DAIRY ))
        items.add( Item("002C","Eden Cheese", 20, ItemCategory.DAIRY ))
        items.add( Item("003A","Ligo Sardines", 20, ItemCategory.CANNED ))
        items.add( Item("003B","Argentina Meatloaf", 20, ItemCategory.CANNED ))
        items.add( Item("003C","Purefoods CornedBeef", 20, ItemCategory.CANNED ))
        items.add( Item("004A","Emperador", 20, ItemCategory.ALCOHOL ))
        items.add( Item("004B","SanMig Pale Pilsen", 20, ItemCategory.ALCOHOL ))
        items.add( Item("004C","Red Horse", 20, ItemCategory.ALCOHOL ))
        items.add( Item("005A","Joy Dishwashing Liquid", 20, ItemCategory.CLEANING ))
        items.add( Item("005B","Tide ", 20, ItemCategory.CLEANING ))
        items.add( Item("005C","Zonrox", 20, ItemCategory.CLEANING ))
    }
    /**
     * This functions will filter every category in the itemList
     */
    fun frozenList (): List<Item> {
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