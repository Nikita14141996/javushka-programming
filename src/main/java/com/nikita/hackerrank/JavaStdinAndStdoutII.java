package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести разные типы данных с клавиатуры и вывести их на экран.
https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 */

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
