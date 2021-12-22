package com.nikita.hackerrank.javaInterface;
/*

https://www.hackerrank.com/challenges/java-interface/problem
 */

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        if (n <= 1) {
            return n;
        }
        int result = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        return result;
    }
}
