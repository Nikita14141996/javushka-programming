package com.nikita.hackerrank.javaInheritanceII;
/*
Задача на наследование классов
https://www.hackerrank.com/challenges/java-inheritance-2/problem
 */

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(22, 20) + " " + adder.add(6, 7) + " " + adder.add(10, 10));
    }
}
