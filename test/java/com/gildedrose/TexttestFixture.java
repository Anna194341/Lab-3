package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        int DAYS_AMOUNT = 4;
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                new AgedBrie(2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Sulfuras(0, 80),
                new Sulfuras(-1, 80),
                new BackstagePass(15, 20),
                new BackstagePass(11, 49),
                new BackstagePass(5, 49),
                new Item("Conjured Mana Cake", 3, 6)
        };

        GildedRose app = new GildedRose(items);
        DayPrinter dayPrinter = new DayPrinter();

        int i = 0;
        while (i < DAYS_AMOUNT) {
            dayPrinter.processDay(i, items);
            app.updateQuality();
            i++;
        }
    }
}
