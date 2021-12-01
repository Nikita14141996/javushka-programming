package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        if (a <= 0 || b <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            s = a * b;
            System.out.println(s);
        }
    }
}
