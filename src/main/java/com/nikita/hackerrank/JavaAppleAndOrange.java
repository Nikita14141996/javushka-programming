package com.nikita.hackerrank;

/*

https://www.hackerrank.com/challenges/apple-and-orange/problem
 */

import java.util.Scanner;

public class JavaAppleAndOrange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] arrayApple = new int[m];
        for (int i = 0; i < m; i++) {
            arrayApple[i] = a + scan.nextInt();
        }
        int[] arrayOrange = new int[n];
        for (int i = 0; i < n; i++) {
            arrayOrange[i] = b + scan.nextInt();
        }
        int apple = 0;
        int orange = 0;
        for (int ap : arrayApple) {
            if (ap >= s && ap <= t)
                apple += 1;
        }
        for (int or : arrayOrange) {
            if (or >= s && or <= t)
                orange += 1;
        }
        System.out.println(apple);
        System.out.println(orange);

    }
}
