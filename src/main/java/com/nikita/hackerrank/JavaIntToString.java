package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < -100 || input > 100) {
            System.out.println("Wrong answer");
        } else {
            System.out.println("Good job");
        }
    }
}
