package contest.weekly.w_300.w_333;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: agitated-curranfnd
 * @Description:
 * @url:   <a href="https://leetcode.cn/contest/weekly-contest-333/problems/minimum-operations-to-reduce-an-integer-to-0">将整数减少到零需要的最少操作数</a>
 * @title: 将整数减少到零需要的最少操作数
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class B {

    public static void main(String[] args) {
        IoUtil.testUtil(B.class,"minOperations","B.txt");
    }


    public int minOperations(int n) {
        return dfs(n);

    }

    public static int dfs(int n) {
        int lb = n & -n;
        if (n == lb) {
            return 1;
        } else {

            return Math.min(dfs(n - lb), dfs(n + lb)) + 1;
        }
    }

  

}