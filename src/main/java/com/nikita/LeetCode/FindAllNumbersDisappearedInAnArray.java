package com.nikita.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findAllNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                list.add(i + 1);
            }
        }
        return list;
    }

    private static void sort(int[] nums) {
        int i = 0;
        int correct;

        while (i < nums.length) {
            correct = nums[i] - 1;

            if (correct < nums.length && nums[correct] != nums[i]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}


