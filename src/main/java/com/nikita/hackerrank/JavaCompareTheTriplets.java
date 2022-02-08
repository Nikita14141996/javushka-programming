package com.nikita.hackerrank;

/*

https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
 */

import java.util.Scanner;

public class JavaCompareTheTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < 3; i++)
            a[i] = scanner.nextInt();

        for (int i = 0; i < 3; i++)
            b[i] = scanner.nextInt();

        for (int i = 0; i < 3; i++)
            if (a[i] > b[i]) {
                countA++;
            } else if (a[i] < b[i]) {
                countB++;
            }
        System.out.println(countA + " " + countB);
    }
}
