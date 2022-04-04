package com.nikita.LeetCode;

public class ClimbingStairs {
    public int climbingStairs(int n) {
        if (n == 1) {
            return n;
        } else if (n == 2) {
            return 2;
        }
        int num1 = 1;
        int num2 = 2;
        int temp;
        for (int i = 2; i < n; i++) {
            temp = num1;
            num1 = num2;
            num2 = temp + num2;
        }
        return num2;
    }
}
