package com.pduda.field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

    @Test
    void multiple_items_number_of_products_in_the_cart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item(10));

        Assertions.assertEquals(1, shoppingCart.numberOfProducts());
    }

    @Test
    void multiple_items_total_price() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item(10));

        Assertions.assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    @Test
    void multiple_items_has_discount_if_contains_at_least_one_product_worth_at_least_100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item(100));

        Assertions.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    void multiple_items_does_not_have_discount_if_contains_no_products_worth_at_least_100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item(99));

        Assertions.assertFalse(shoppingCart.hasDiscount());
    }

}
