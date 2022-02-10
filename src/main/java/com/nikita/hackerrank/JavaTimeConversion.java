package com.nikita.hackerrank;

/*

https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
 */
import java.util.Scanner;

public class JavaTimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        int time = Integer.parseInt(line.substring(0, 2));
        if (line.contains("PM")){
            time += 12;
       } else if (line.contains("AM")) {
            time -= 12;
        }
        System.out.printf("%02d%s", time, line.substring(2, 8));
    }
}
