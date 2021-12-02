package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести число с клавиатуры, пропустить через цикл и на выходе должна получиться таблица умножения, выведенная на экран.
https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
 */

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
