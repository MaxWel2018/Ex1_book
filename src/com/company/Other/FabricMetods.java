package com.company.Other;

import java.text.NumberFormat;

public class FabricMetods {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFomatter = NumberFormat.getPercentInstance();
        double x = 0.1;

        System.out.println(currencyFormatter.format(x)); // Выводит $ 0 .1 0
        System.out.println(percentFomatter.format(x));
    }
}
