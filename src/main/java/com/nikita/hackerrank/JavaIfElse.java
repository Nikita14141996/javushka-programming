package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести число с консоли, проверить к какому диапазону оно относится и вывести на экран сообщение.
https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
 */

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input % 2 == 1 || input >= 6 && input <= 20) {
            System.out.println("Weird");
        } else if (input % 2 == 0 || input >= 2 && input <= 5) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
