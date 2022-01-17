package com.summer.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap();
        // Map的key为数组的值
        // Map的value存放数组的下标
        // 当target - 数组的值正好出现 == Map的key，那就打印[map.get(Key), i]
        for (int i = 0; i < nums.length; i++) {
            if (intMap.containsKey(target - nums[i])) {
                return new int[]{intMap.get(target - nums[i]), i};
            }
            intMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,7,3,15};
        int target = 6;
        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println(ints.toString());
//        System.out.println(twoSum(nums, target));
    }
}
