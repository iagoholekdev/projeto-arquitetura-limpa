package org.example.utils.aleatorios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomValuesTest {

    @Test
    public void testGenerateRandomValue() {
        double randomValue = RandomValues.generateRandomValue();

        assertTrue(randomValue >= 5.0 && randomValue <= 15.0, "Generated value is outside the expected range");

        String[] decimalParts = Double.toString(randomValue).split("\\.");
        assertTrue(decimalParts.length == 1 || decimalParts[1].length() <= 2, "Generated value has more than two decimal places");
    }


}