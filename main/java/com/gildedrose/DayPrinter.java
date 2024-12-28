package com.gildedrose;

public class DayPrinter {
    private static final String HEADER = "name, sellIn, quality";

    public void processDay(int day, Item[] items) {
        printDayHeader(day);
        printItems(items);
    }

    public void printDayHeader(int day) {
        System.out.println("-------- day " + day + " --------");
        System.out.println(HEADER);
    }

    public void printItems(Item[] items) {
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();
    }
}

