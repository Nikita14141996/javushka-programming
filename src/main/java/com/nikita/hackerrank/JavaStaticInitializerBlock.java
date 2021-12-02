package com.nikita.hackerrank;

import java.util.Scanner;
/*
Ввести числа с клавиатуры, посчитать площадь параллелограмма и вывести на экран. Если числа отрицательные, вывести
сообщение об ошибке.
https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
 */

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        if (a <= 0 || b <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            s = a * b;
            System.out.println(s);
        }
    }
}
