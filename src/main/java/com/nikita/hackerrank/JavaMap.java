package com.nikita.hackerrank;

import java.util.HashMap;
import java.util.Scanner;
/*
Дана телефонная книга, состоящая из людей и номеров телефонов. Вводится имя человека. Вывести его номер телефона.
Если номера нет, то вывести сообщение.
https://www.hackerrank.com/challenges/phone-book/problem
 */

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            phoneBook.put(name, phone);
            scanner.nextLine();
        }
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (phoneBook.containsKey(input)) {
                System.out.println(input + "=" + phoneBook.get(input));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
