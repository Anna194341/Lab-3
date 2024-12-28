package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Backstage passes to a TAFKAL80ETC concert":
                    item.increaseQualityByOne();
                    if (item.sellIn < 11) {
                        item.increaseQualityByOne();
                    }
                    if (item.sellIn < 6) {
                        item.increaseQualityByOne();
                    }
                    item.sellIn = item.sellIn - 1;
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    item.updateQuality();
                    break;
            }
        }
    }
}
