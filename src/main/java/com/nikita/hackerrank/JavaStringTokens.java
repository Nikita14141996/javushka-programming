package com.nikita.hackerrank;

import java.util.Scanner;

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
