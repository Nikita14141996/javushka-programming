package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String output = input.substring(start, end);
        System.out.println(output);
    }
}
