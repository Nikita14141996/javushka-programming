package com.nikita.hackerrank;

import java.util.Scanner;
/*
Прочитать с консоли некоторое количество строк, пронумеровать и вывести на экран.
https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 */

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()) {
            count++;
            System.out.println(count + " " + scanner.nextLine());
        }
    }
}
