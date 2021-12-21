package com.nikita.hackerrank.sherlock;

import java.util.HashMap;
import java.util.Map;

/*

https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings&h_r=next-challenge&h_v=zen
 */

public class SherlockTaskWithMap implements SherlockTask {
    public String valid(String line) {
        Map<Character, Integer> dictionary = new HashMap<>();
        Integer max = 0;

        for (Character ch : line.toCharArray()) {
            Integer count = dictionary.get(ch);
            if (count == null) {
                dictionary.put(ch, 1);
            } else {
                dictionary.put(ch, ++count);
                if (count > max) {
                    max = count;
                }
            }
        }
        Integer min = max;
        Integer maxChGroup = 0;

        for (Integer value : dictionary.values()) {
            if (value.equals(max)) {
                maxChGroup++;
            }
            if (value < min) {
                min = value;
            }
        }
        Integer minGroupLength = line.length() - max * maxChGroup;
        if (max - min > 1) {
            if (minGroupLength == 1) {
                return "YES";
            } else {
                return "NO";
            }
        } else if (max.equals(min)) {
            return "YES";
        } else if (max - min == 1 && maxChGroup.equals(1)) {
            return "YES";
        } else if (min == 1 && minGroupLength == 1) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String line = "abbddeeffgg";
        System.out.println(new SherlockTaskWithMap().valid(line));

    }
}
