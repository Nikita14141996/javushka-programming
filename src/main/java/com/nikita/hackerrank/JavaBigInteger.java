package com.nikita.hackerrank;

    import java.math.BigInteger;
    import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger sum = a.add(b);
        BigInteger result = a.multiply(b);
        System.out.println(sum);
        System.out.println(result);
    }
}
