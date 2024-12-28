package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        if (sellIn >= 0) increaseQualityBy(1);
        if (sellIn < 0) increaseQualityBy(2);
    }
}

