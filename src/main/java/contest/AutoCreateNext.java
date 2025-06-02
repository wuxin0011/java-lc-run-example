package contest;

import code_generation.crwal.leetcode.LCContest;


/**
 * 使用前请配置 网站 cookie  在 request_config//cookie.txt
 * 自动获取下一场周赛
 */
public class AutoCreateNext {

    public static void main(String[] args) {
        LCContest.autoCreateNext(AutoCreateNext.class);
    }
}
