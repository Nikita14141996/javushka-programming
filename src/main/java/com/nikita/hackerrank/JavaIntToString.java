package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести с клавиатуры число и вывести на экран сообщение.
https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
 */

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
