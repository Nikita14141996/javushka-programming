package com.nikita.hackerrank;


import java.util.Scanner;
/*
Ввести с клавиатуры длинну массива и сам массив. Подсчитать количество отрицательных подмассивов и вывести на экран.
https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int y = j; y < n; y++) {
                sum = array[y] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
