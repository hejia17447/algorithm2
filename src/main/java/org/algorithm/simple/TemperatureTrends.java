package org.algorithm.simple;

/**
 * LCP 61. 气温变化趋势
 * 力扣城计划在两地设立「力扣嘉年华」的分会场，气象小组正在分析两地区的气温变化趋势，对于第 i ~ (i+1) 天的气温变化趋势，将根据以下规则判断：
 * 若第 i+1 天的气温 高于 第 i 天，为 上升 趋势
 * 若第 i+1 天的气温 等于 第 i 天，为 平稳 趋势
 * 若第 i+1 天的气温 低于 第 i 天，为 下降 趋势
 * 已知 temperatureA[i] 和 temperatureB[i] 分别表示第 i 天两地区的气温。 组委会希望找到一段天数尽可能多，且两地气温变化趋势相同的时间举办嘉年华活动。请分析并返回两地气温变化趋势相同的最大连续天数。
 * @author jiahe
 */
public class TemperatureTrends {

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int res = 0;
        int j = 0;

        for (int i = 1; i < temperatureA.length; i++) {
            if ((temperatureA[i - 1] > temperatureA[i] && temperatureB[i - 1] > temperatureB[i]) ||
                    (temperatureA[i - 1] < temperatureA[i] && temperatureB[i - 1] < temperatureB[i]) ||
                    (temperatureA[i - 1] == temperatureA[i] && temperatureB[i - 1] == temperatureB[i])) {
                res = Math.max(res, i - j);
            } else {
                j = i;
            }
        }

        return res;
    }

}
