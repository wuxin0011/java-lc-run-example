package everyday;

import code_generation.crwal.leetcode.LCEveryDay;


/**
 * 使用前请配置 网站 cookie 再 request_config
 * 每日一题自定义 请输入每日一题链接
 */
public class CustomDay {
    public static void main(String[] args) {
        LCEveryDay.everyDay.custom(CustomDay.class);
    }
}
