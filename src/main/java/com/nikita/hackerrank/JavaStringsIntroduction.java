package com.nikita.hackerrank;

import java.util.Locale;
import java.util.Scanner;
/*
Ввести несколько строк с клавиатуры и вывести на экран соединенные строки, в которых надо сделать заглавными первые
символы.
https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
 */

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(a.substring(0, 1).toUpperCase(Locale.ROOT) + a.substring(1, a.length()) + " " + b.substring(0, 1).toUpperCase(Locale.ROOT) + b.substring(1, b.length()));
    }
}
