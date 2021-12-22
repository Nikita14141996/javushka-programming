package com.nikita.hackerrank.javaMethodOverriding2;
/*

https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem
 */

public class MotorCycle extends ByCycle {
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}
