package ItemManagement

class ItemsList {
    val items = mutableListOf<Items>()
    init {
        items.add( Items("001A","TenderJuicy Hotdog", 20, ItemCategory.FROZEN))
        items.add( Items("001B","Pampanga's Best Tocino", 20, ItemCategory.FROZEN ))
        items.add( Items("001C","Purefoods Nuggers", 20, ItemCategory.FROZEN ))
        items.add( Items("002A","BearBrand", 20, ItemCategory.DAIRY ))
        items.add( Items("002B","Anchor Butter", 20, ItemCategory.DAIRY ))
        items.add( Items("002C","Eden Cheese", 20, ItemCategory.DAIRY ))
        items.add( Items("003A","Ligo Sardines", 20, ItemCategory.CANNED ))
        items.add( Items("003B","Argentina Meatloaf", 20, ItemCategory.CANNED ))
        items.add( Items("003C","Purefoods CornedBeef", 20, ItemCategory.CANNED ))
        items.add( Items("004A","Emperador", 20, ItemCategory.ALCOHOL ))
        items.add( Items("004B","SanMig Pale Pilsen", 20, ItemCategory.ALCOHOL ))
        items.add( Items("004C","Red Horse", 20, ItemCategory.ALCOHOL ))
        items.add( Items("005A","Joy Dishwashing Liquid", 20, ItemCategory.CLEANING ))
        items.add( Items("005B","Tide ", 20, ItemCategory.CLEANING ))
        items.add( Items("005C","Zonrox", 20, ItemCategory.CLEANING ))
    }
}