package com.nikita.LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : nums) {
            if (set.contains(j))
                return true;
            set.add(j);
        }
        return false;
    }
}
