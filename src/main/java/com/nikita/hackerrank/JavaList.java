package com.nikita.hackerrank;

import java.util.LinkedList;
import java.util.Scanner;
/*

https://www.hackerrank.com/challenges/java-list/problem
 */

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            linkedList.add(number);
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String line = scanner.next();
            if (line.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                linkedList.add(x, y);
            } else {
                int x = scanner.nextInt();
                linkedList.remove(x);
            }
        }
        for (Integer i : linkedList) {
            System.out.println(i + " ");
        }
    }
}
