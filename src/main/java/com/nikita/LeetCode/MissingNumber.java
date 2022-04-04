package com.nikita.LeetCode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for (int num : nums) {
            sum += num;
        }
        return length * (length + 1) / 2 - sum;
    }

}
