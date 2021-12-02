package com.nikita.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
/*
Ввести с клавиатуры два слова и проверить, что они анаграммы(содержат одинаковые символы с одинаковой частотой).
https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
 */

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.next().toLowerCase();
        String secondLine = scanner.next().toLowerCase();
        char[] charArrayFirst = firstLine.toCharArray();
        char[] charArraySecond = secondLine.toCharArray();
        Arrays.sort(charArrayFirst);
        Arrays.sort(charArraySecond);
        String newFirsLine = new String(charArrayFirst);
        String newSecondLine = new String(charArraySecond);
        if (newFirsLine.equals(newSecondLine)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
