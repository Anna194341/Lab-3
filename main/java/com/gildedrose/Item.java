package com.gildedrose;

public class Item {

    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void resetQuality() {
        quality = 0;
    }

    public void updateQuality() {
        decreaseSellIn();
        if (sellIn >= 0) decreaseQualityBy(1);
        if (sellIn < 0) decreaseQualityBy(2);
    }

    public void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    public void decreaseQualityBy(int amount) {
        quality -= amount;
        if (quality < 0) resetQuality();
    }

    public void increaseQualityBy(int amount) {
        quality += amount;
        if (quality > 50) quality = 50;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
