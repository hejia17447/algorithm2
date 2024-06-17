package org.algorithm.medium;

/**
 * 522. 最长特殊序列 II
 * 给定字符串列表 strs ，返回其中 最长的特殊序列 的长度。如果最长特殊序列不存在，返回 -1 。
 * 特殊序列 定义如下：该序列为某字符串 独有的子序列（即不能是其他字符串的子序列）。
 *  s 的 子序列可以通过删去字符串 s 中的某些字符实现。
 * 例如，"abc" 是 "aebdc" 的子序列，因为您可以删除"aebdc"中的下划线字符来得到 "abc" 。"aebdc"的子序列还包括"aebdc"、 "aeb" 和 "" (空字符串)。
 * 示例 1：
 * 输入: strs = ["aba","cdc","eae"]
 * 输出: 3
 * 示例 2:
 * 输入: strs = ["aaa","aaa","aa"]
 * 输出: -1
 * @author jiahe
 */
public class LongestUncommonSubsequenceII {

    public int findLusLength(String[] str) {
        int res = -1;
        outer: for (int i = 0; i < str.length; ++i) {
            for (int j = 0; j < str.length; ++j) {
                if (i == j) {
                    continue;
                }
                if (inSubSequence(str[i], str[j])) {
                    continue outer;
                }
            }
            res = Math.max(res, str[i].length());
        }
        return res;
    }

    private boolean inSubSequence(String a, String b) {
        if (a.length() > b.length()) {
            return false;
        }
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                ++i;
            }
            ++j;
        }
        return i == a.length();
    }

}
