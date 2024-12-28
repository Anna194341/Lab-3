package com.gildedrose;

public class Conjured extends Item {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        if (sellIn >= 0) decreaseQualityBy(2);
        if (sellIn < 0) decreaseQualityBy(4);
    }
}
