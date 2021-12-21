package com.nikita.hackerrank;

import java.util.Arrays;
/*

https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings&h_r=next-challenge&h_v=zen
 */

public class SherlockTaskWithSorting implements SherlockTask {

    public static String sort(String unsorted) {
        char[] charsArray = unsorted.toCharArray();
        StringBuilder sortedLine = new StringBuilder();

        Arrays.sort(charsArray);
        sortedLine.append(charsArray);

        return sortedLine.toString();
    }

    public static String packing(String unpacked) {
        String sortUnpacked = SherlockTaskWithSorting.sort(unpacked);
        char[] chars = sortUnpacked.toCharArray();
        StringBuilder zipped = new StringBuilder();
        char pivot = chars[0];
        int counter = 1;
        if (chars.length == 1) {
            counter = 1;
            zipped.append(counter);
        }
        for (int i = 1; i < chars.length; i++) {
            char current = chars[i];
            if (current == pivot) {
                counter++;
            } else {
                zipped.append(counter);
                counter = 1;
            }
            pivot = current;
            if (i == chars.length - 1) {
                zipped.append(counter);
            }
        }
        return zipped.toString();
    }

    public String valid(String sortPacking) {
        String proofPacking = SherlockTaskWithSorting.packing(sortPacking);
        String proofSortPacking = SherlockTaskWithSorting.sort(proofPacking);
        char[] chars = proofSortPacking.toCharArray();
        int counter = 0;
        int pivot = chars[0];

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];

            if (current != pivot) {
                counter++;
            }
            pivot = current;
            if (i == chars.length - 1) {
                System.out.println(counter);
            }
        }
        if (counter > 1 || counter < 0) {
            return "NO";
        } else if (chars[chars.length - 1] - chars[0] > 1) {
            return "NO";
        } else if (chars.length <= 1) {
            return "YES";
        } else if (counter == 0) {
            return "YES";
        } else if (chars[0] == chars[1] & chars[chars.length - 1] == chars[chars.length - 2] & counter > 0) {
            return "NO";

        } else if (chars[0] == '1' | chars[chars.length - 1] - chars[chars.length - 2] == 1) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String line = "aaabbbcccdddfffeeea";
        System.out.println(new SherlockTaskWithSorting().valid(line));
    }

}

