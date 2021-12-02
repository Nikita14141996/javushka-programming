package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести строку с клавиатуры, проверить палиндром ли это и вывести на экран.
https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
 */

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reverseInput = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reverseInput) ? "Yes" : "No");
    }
}
