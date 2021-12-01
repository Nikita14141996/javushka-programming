package com.nikita.hackerrank;

import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {

            try {
                long longInput = scanner.nextLong();
                System.out.println(longInput + " can be fitted in:");

                if (longInput == (byte) longInput)
                    System.out.println("* byte");
                if (longInput == (short) longInput)
                    System.out.println("* short");
                if (longInput == (int) longInput)
                    System.out.println("* int");
                if (longInput == longInput)
                    System.out.println("* long");

            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
