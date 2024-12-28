package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQualityByOne();
        if (sellIn < 11) {
            increaseQualityByOne();
        }
        if (sellIn < 6) {
            increaseQualityByOne();
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
