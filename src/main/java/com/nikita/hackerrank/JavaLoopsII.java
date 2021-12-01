package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            for (int j = 0; j < c; j++) {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
