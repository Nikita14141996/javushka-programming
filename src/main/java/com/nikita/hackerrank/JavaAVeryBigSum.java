package com.nikita.hackerrank;

/*

https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */

import java.util.Scanner;

public class JavaAVeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine().trim());
        long sum = 0;
        long[] array = new long[num];
        String[] arrayString = scanner.nextLine().split(" ");

        for (int i = 0; i < num; i++) {
            long number = Integer.parseInt(arrayString[i].trim());
            array[i] = number;
        }
        for (long l : array) {
            sum += l;
        }
        System.out.println(sum);
    }
}
