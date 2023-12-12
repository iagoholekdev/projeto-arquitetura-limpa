package org.example.utils.aleatorios;

import java.text.DecimalFormat;

public class RandomValues {

    public static double generateRandomValue() {
        double randomValue = 5.0 + (15.0 - 5.0) * Math.random();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedRandomValue = decimalFormat.format(randomValue);
        return Double.parseDouble(formattedRandomValue);
    }

}
