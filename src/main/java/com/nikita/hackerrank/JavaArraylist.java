package com.nikita.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
 */


public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> newArrayList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                newArrayList.add(scanner.nextInt());
            }
            arrayList.add(newArrayList);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                System.out.println(arrayList.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
    }
}
