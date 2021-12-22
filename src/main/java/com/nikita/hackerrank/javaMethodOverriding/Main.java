package com.nikita.hackerrank.javaMethodOverriding;
/*

https://www.hackerrank.com/challenges/java-method-overriding/problem
 */

public class Main {
    public static void main(String[] args) {
        Soccer sc = new Soccer();
        Sports sp = new Sports();
        System.out.println(sp.getName());
        sp.getNumberOfTeamMembers();
        System.out.println(sc.getName());
        sc.getNumberOfTeamMembers();
    }
}
