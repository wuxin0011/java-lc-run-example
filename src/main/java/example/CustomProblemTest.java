package example;

import code_generation.crwal.leetcode.LCSolutionTemplate;

/**
 * 单个或者批量输入题目链接提起 两次回车执行
 */
public class CustomProblemTest {
    public static void main(String[] args) {
        new LCSolutionTemplate(CustomProblemTest.class, "Solution").run();
    }
}
