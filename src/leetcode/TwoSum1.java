package leetcode;

import java.util.*;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 5, 7, 22};
        int[] nums2 = {14,7,10,3,7,2,4,4};
        //System.out.println(Arrays.toString(twoSum(nums, 12)));
        System.out.println(Arrays.toString(twoSumHashMap(nums2, 17)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + (nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}