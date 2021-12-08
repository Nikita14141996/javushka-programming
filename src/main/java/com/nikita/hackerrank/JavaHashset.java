package com.nikita.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
/*
Ввести количество пар имен, потом сами имена и вывести на экран количество уникальных пар.
https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
 */


public class JavaHashset {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        HashSet<String> heap = new HashSet<>();
        while (t-- > 0) {
            heap.add(reader.readLine());
            System.out.println(heap.size());
        }
    }
}
