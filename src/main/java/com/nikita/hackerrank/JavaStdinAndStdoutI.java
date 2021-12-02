package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести числа с клавиатуры и вывести их на экран.
https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
 */

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int last = scanner.nextInt();
        System.out.println(first);
        System.out.println(second);
        System.out.println(last);

    }

}
