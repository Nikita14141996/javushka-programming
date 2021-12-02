package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести число из стандартного ввода. Это число будет длинной массива. Заполнить массив числами, введеннымы с клавиатуры.
https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
 */

public class Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
