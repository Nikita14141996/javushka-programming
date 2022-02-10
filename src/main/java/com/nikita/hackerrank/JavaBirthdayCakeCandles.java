package com.nikita.hackerrank;


/*

https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
 */
import java.util.Scanner;

public class JavaBirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int max = 0;
        int sum = 0;
        int num;
        for (int i = 0; i < in; i++) {
            num = scanner.nextInt();
            if (num > max) {
                sum = 1;
                max = num;
            } else if (num == max) {
                sum++;
            }
        }
        System.out.println(sum);

    }
}
