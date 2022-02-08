package com.nikita.hackerrank;

/*

https://www.hackerrank.com/challenges/simple-array-sum/problem
 */

import java.util.Scanner;

public class JavaSimpleArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine().trim());
        int sum = 0;
        int[] array = new int[amount];
        String[] arrayString = scanner.nextLine().split(" ");

        for (int i = 0; i < amount; i++) {
            int number = Integer.parseInt(arrayString[i].trim());
            array[i] = number;
        }
        for (int j : array) {
            sum += j;
        }
        System.out.println(sum);
    }

}

