package com.gildedrose;

public class BackstagePass extends Item {

    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        if (sellIn > 10) increaseQualityBy(1);
        if (sellIn <= 10 & sellIn > 5) increaseQualityBy(2);
        if (sellIn <= 5 & sellIn >= 0) increaseQualityBy(3);
        if (sellIn < 0) resetQuality();
    }
}
