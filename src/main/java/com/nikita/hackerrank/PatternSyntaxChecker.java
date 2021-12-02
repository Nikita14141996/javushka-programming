package com.nikita.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
/*
Ввести число шаблонов и сами шаблоны, а потом проверить, является ли синтансис шаблона правильным и вывести результат
на экран.
https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
 */

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            try {
                String line = scanner.nextLine();
                Pattern.compile(line);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
