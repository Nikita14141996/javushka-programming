package com.nikita.hackerrank.javaAbstractClass;
/*

https://www.hackerrank.com/challenges/java-abstract-class/problem
 */

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}
