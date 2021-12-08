package com.nikita.hackerrank;
/*
Вывести с помощью дженериков и одного метода на экран 2 массива.
https://www.hackerrank.com/challenges/java-generics/problem
 */

public class JavaGenerics {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Integer[] intArray = new Integer[]{1, 2, 3};
        String[] stringsArray = new String[]{"Hello", "World"};
        printer.printArray(intArray);
        printer.printArray(stringsArray);
    }
}

class Printer {
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

