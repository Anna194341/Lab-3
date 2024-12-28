package com.gildedrose;

public class BackstagePass extends Item {

    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        if (sellIn < 0) {
            resetQuality();
            return;
        }
        increaseQualityByOne();
        if (sellIn < 11) increaseQualityByOne();
        if (sellIn < 6) increaseQualityByOne();
    }

    private void resetQuality() {
        quality = 0;
    }
}
