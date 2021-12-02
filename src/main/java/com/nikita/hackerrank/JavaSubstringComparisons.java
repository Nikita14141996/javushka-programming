package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести строку и длинну подстроки с клавиатуры, найти наибольшую и наименьшую подстроки и вывести на экран.
https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
 */

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int range = scanner.nextInt();
        String minInput = input.substring(0, range);
        String maxInput = input.substring(0, range);
        for (int i = 1; i < input.length() - range + 1; i++) {
            String subInput = input.substring(i, i + range);
            if (subInput.compareTo(minInput) < 0) {
                minInput = subInput;
            }
            if (subInput.compareTo(maxInput) > 0) {
                maxInput = subInput;
            }
        }
        System.out.println(minInput);
        System.out.println(maxInput);
    }
}
