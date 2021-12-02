package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести строку и несколько чисел с клавиатуры и вывести на экран часть введенной строки, с индексами от первой цифры до
последней цифры.
https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
 */

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
