package contest;

import code_generation.crwal.leetcode.LCContest;

/**
 * 使用前请配置 网站 cookie 再 request_config
 * 输入双周赛序号获取当前双周赛
 */
public class CustomBIWeekContest {

    public static void main(String[] args) {
        LCContest.BI_WEEK_CONTEST.createNo(CustomBIWeekContest.class);
    }
}
