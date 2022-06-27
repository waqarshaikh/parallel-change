package com.pduda.field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImagineThisIsAClientInADifferentRepositoryTest {


    @Test
    void multiple_items_number_of_products_in_the_cart() throws Exception {
        ImagineThisIsAClientInADifferentRepository client = new ImagineThisIsAClientInADifferentRepository();

        Assertions.assertEquals("Total price is 50 euro", client.formattedTotalPrice(50));
    }

}
