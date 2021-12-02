package com.nikita.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/*
Ввод с клавиатуры числа, которое будет преобразовано к валютам разных стран.
https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
 */

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
