package com.nikita.hackerrank;

import com.nikita.hackerrank.sherlock.SherlockTask;
import com.nikita.hackerrank.sherlock.SherlockTaskWithMap;
import com.nikita.hackerrank.sherlock.SherlockTaskWithSorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class SherlockTestUtils {
    private void testYes(SherlockTask sh) {
        List<String> lines = List.of("aabb", "aaabbbcccdddfffeeea", "abcdefghij", "aabbcddeeffgg");
        for (String yes : lines) {
            Assertions.assertEquals("YES", sh.valid(yes));
        }
    }

    private void testNo(SherlockTask sh) {
        List<String> lines = List.of("aabbcccc", "aabbbccc", "aaabbcccc", "aaabcd", "abcddddddd");
        for (String no : lines) {
            Assertions.assertEquals("NO", sh.valid(no));
        }
    }

    @Test
    void SherlockTaskWithSortingCorrectlyWorksWithYes() {
        SherlockTask sh = new SherlockTaskWithSorting();
        testYes(sh);
    }

    @Test
    void SherlockTaskWithMapCorrectlyWorksWithYes() {
        SherlockTask sh = new SherlockTaskWithMap();
        testYes(sh);
    }

    @Test
    void SherlockTaskWithSortingCorrectlyWorksWithNo() {
        SherlockTask sh = new SherlockTaskWithSorting();
        testNo(sh);
    }

    @Test
    void SherlockTaskWithMapCorrectlyWorksWithNo() {
        SherlockTask sh = new SherlockTaskWithMap();
        testNo(sh);
    }
}
