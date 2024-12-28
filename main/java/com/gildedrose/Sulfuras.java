package com.gildedrose;

public class Sulfuras extends Item{

    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // there's nothing in this method because Sulfuras never change Quality
    }
}
