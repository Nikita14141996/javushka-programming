package com.nikita.hackerrank;

/*

https://www.hackerrank.com/challenges/kangaroo/problem
 */
import java.util.Scanner;

public class JavaNumberLineJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int differenceV = v1 - v2;

        if (differenceV <= 0) {
            System.out.println("NO");
            return;

        }
        int differenceX = x1 - x2;

        if (differenceX % differenceV == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
