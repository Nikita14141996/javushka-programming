package com.nikita.hackerrank.javaMethodOverriding;
/*

https://www.hackerrank.com/challenges/java-method-overriding/problem
 */

public class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}
