package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести с клавиатуры двумерный массив и вывести на экран максимальную сумму "песочных часов".
https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
 */

public class Java2DArray {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = scanner.nextInt();
                if (i > 1 && j > 1) {
                    int sum = array[i][j]
                            + array[i][j - 1]
                            + array[i][j - 2]
                            + array[i - 1][j - 1]
                            + array[i - 2][j]
                            + array[i - 2][j - 1]
                            + array[i - 2][j - 2];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
