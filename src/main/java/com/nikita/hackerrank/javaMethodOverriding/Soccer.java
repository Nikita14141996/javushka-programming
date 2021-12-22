package com.nikita.hackerrank.javaMethodOverriding;
/*

https://www.hackerrank.com/challenges/java-method-overriding/problem
 */

public class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
