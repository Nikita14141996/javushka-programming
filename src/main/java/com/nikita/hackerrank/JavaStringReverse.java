package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reverseInput = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reverseInput) ? "Yes" : "No");
    }
}
