package ItemManagement

class ItemsList {
    val items = mutableListOf<Item>()
    init {
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
}