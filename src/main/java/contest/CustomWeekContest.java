package contest;

import code_generation.crwal.leetcode.LCContest;

/**
 * 使用前请配置 网站 cookie 再 request_config
 * 输入周赛序号获取当前周赛
 */
public class CustomWeekContest {
    public static void main(String[] args) {
        LCContest.WEEK_CONTEST.createNo(CustomWeekContest.class);
    }
}
