package com.pduda.field;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item: items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public boolean hasDiscount() {
        for (Item item : items) {
            if (item.getPrice() >= 100) {
                return true;
            }
        }
        return false;
    }

    public int numberOfProducts() {
        return items.size();
    }
}
