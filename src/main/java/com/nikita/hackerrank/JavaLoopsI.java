package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            int result = input * i;
            System.out.println(input + " x " + i + " = " + result);
        }
    }
}
