package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String st = scanner.next();
            int n = scanner.nextInt();
            System.out.printf("%-15s%03d%n", st, n);
        }
        System.out.println("================================");
    }
}
