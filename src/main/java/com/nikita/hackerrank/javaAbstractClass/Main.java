package com.nikita.hackerrank.javaAbstractClass;
/*
Задача на наследование классов с добавлением абстрактного класса
https://www.hackerrank.com/challenges/java-abstract-class/problem
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        MyBook book = new MyBook();
        book.setTitle(line);
        System.out.println("The title is: " + book.getTitle());
    }
}
