package com.pduda.field;

public class ImagineThisIsAClientInADifferentRepository {
    public String formattedTotalPrice(int price) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item(price));
        return String.format("Total price is %d euro", shoppingCart.calculateTotalPrice());
    }
}
