package com.albenyuan.leetcode.q1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Alben Yuan
 * @Date 2019-01-07 11:40
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] r = new int[length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (target != nums[i] || target == 0) {
                r[i] = target - nums[i];
            }
            map.put(nums[i], i);
        }
        for (int i = 0; i < length; i++) {
            int n = r[i];
            if ((0 != n || target == 0) && map.containsKey(n)) {
                int j = map.get(n);
                if (i != j) {
                    return new int[]{i, map.get(n)};
                }
            }
        }
        return null;
    }
}
