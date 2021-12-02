package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести строку с клавиатуры, разбить ее по пробелам на слова и вывести каждое слово с новой строки.
https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
 */

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        if (line.length() == 0) {
            System.out.println(0);
        } else {
            String[] arrayWords = line.split("[ !,?.\\_'@]+");
            int arrayLength = arrayWords.length;
            System.out.println(arrayLength);
            for (String words : arrayWords) {
                System.out.println(words);
            }
        }
    }
}
