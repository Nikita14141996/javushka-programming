package com.nikita.hackerrank.javaVarargs;

public class Add {
    public void add(int... ints) {
        int sum = 0;
        String division = "";
        for (int n : ints) {
            sum = sum + n;
            System.out.print(division + n);
            division = "+";
        }
        System.out.println("=" + sum);
    }
}
