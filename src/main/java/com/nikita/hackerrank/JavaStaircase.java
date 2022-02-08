package com.nikita.hackerrank;

/*

https://www.hackerrank.com/challenges/staircase/problem
 */

import java.util.Scanner;

public class JavaStaircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int lvl = size - 1;
        for (int i = 0; i < size; i++) {
            String string = " ".repeat(Math.max(0, lvl)) +
                    "#".repeat(Math.max(0, size - lvl));
            lvl -= 1;
            System.out.println(string);
        }
    }
}
