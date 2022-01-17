package com.summer.leetcode;

import java.util.HashSet;

/**
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LeetCode3_LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        // 初始 左指针（慢指针），右指针（快指针），最大值都为0
        int left = 0;
        int right = 0;
        int maxLen = 0;
        HashSet<Character> hashSet = new HashSet<Character>();
        // 滑动窗口
        while (left < s.length() && right < s.length()) {
            // 利用set不重复，如果包含当前字符
            // set移除之前的字符，左指针（慢指针）+1
            if (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left));
                left++;
            } else {
                // 如果没包含当前字符，往set添加字符
                // 右指针（快指针）+1
                // maxLen开始更新（也就是滑动窗口的长度开始更新）
                hashSet.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("asdasdasdasdqwertyuiq"));
    }
}
