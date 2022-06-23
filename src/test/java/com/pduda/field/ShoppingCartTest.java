package com.pduda.field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {


    @Test
    void singleItem_numberOfProductsInTheCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assertions.assertEquals(1, shoppingCart.numberOfProducts());
    }

    @Test
    void singleItem_totalPrice() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assertions.assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    @Test
    void singleItem_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        Assertions.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    void singleItem_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        Assertions.assertFalse(shoppingCart.hasDiscount());
    }

}
