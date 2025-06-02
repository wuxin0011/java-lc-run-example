package contest.weekly.w_300.w_333;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: silly-heisenberg8lk
 * @Description:
 * @url:   <a href="https://leetcode.cn/contest/weekly-contest-333/problems/find-the-string-with-lcp">找出对应 LCP 矩阵的字符串</a>
 * @title: 找出对应 LCP 矩阵的字符串
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class D {

    public static void main(String[] args) {
        IoUtil.testUtil(D.class,"findTheString","D.txt");
    }


    public String findTheString(int[][] lcp) {
        int i = 0, n = lcp.length;
        char[] s = new char[n];
        for (char c = 'a'; c <= 'z'; ++c) {
            while (i < n && s[i] > 0) ++i;
            if (i == n) break; // 构造完毕
            for (int j = i; j < n; ++j)
                if (lcp[i][j] > 0) s[j] = c;
        }
        while (i < n) if (s[i++] == 0) return ""; // 没有构造完

        // 直接在原数组上验证
        for (i = n - 1; i >= 0; --i)
            for (int j = n - 1; j >= 0; --j) {
                int actualLCP = s[i] != s[j] ? 0 : i == n - 1 || j == n - 1 ? 1 : lcp[i + 1][j + 1] + 1;
                if (lcp[i][j] != actualLCP) return "";
            }
        return new String(s);
    }

//    作者：灵茶山艾府
//    链接：https://leetcode.cn/problems/find-the-string-with-lcp/solutions/2120175/tan-xin-gou-zao-yan-zheng-o1e-wai-kong-j-82ik/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

  

}