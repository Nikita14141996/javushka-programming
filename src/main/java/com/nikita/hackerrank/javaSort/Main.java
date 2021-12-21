package com.nikita.hackerrank.javaSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
сравнить с помощью компаратора студентов и вывести на экран
https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=false
 */

public class Main {
    public static void main(String[] args) {
        Student Marta = new Student(33, "Marta", 33.33);
        Student Vanya = new Student(44, "Vanya", 44.66);
        Student Ivan = new Student(12, "Ivan", 33.33);
        Student Ser = new Student(55, "Ser", 55.55);
        Student Ebobo = new Student(22, "Ebobo", 44.66);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Marta);
        studentList.add(Vanya);
        studentList.add(Ivan);
        studentList.add(Ser);
        studentList.add(Ebobo);

        Collections.sort(studentList, new StudentComparator());
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}
