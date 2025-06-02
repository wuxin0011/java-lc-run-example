package contest.weekly.w_300.w_333;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: agitated-curranfnd
 * @Description:
 * @url:   <a href="https://leetcode.cn/contest/weekly-contest-333/problems/count-the-number-of-square-free-subsets">无平方子集计数</a>
 * @title: 无平方子集计数
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class C {

    public static void main(String[] args) {
        IoUtil.testUtil(C.class,"squareFreeSubsets","C.txt");
    }
     

    private static final int[] PRIMES = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    private static final int MOD = (int) 1e9 + 7, MX = 30, N_PRIMES = PRIMES.length, M = 1 << N_PRIMES;
    private static final int[] SF_TO_MASK = new int[MX + 1]; // SF_TO_MASK[i] 为 i 的质因子集合（用二进制表示）

    static {
        for (int i = 2; i <= MX; ++i)
            for (int j = 0; j < N_PRIMES; ++j) {
                int p = PRIMES[j];
                if (i % p == 0) {
                    if (i % (p * p) == 0) { // 有平方因子
                        SF_TO_MASK[i] = -1;
                        break;
                    }
                    SF_TO_MASK[i] |= 1 << j; // 把 j 加到集合中
                }
            }
    }

    public int squareFreeSubsets(int[] nums) {
        int[] f = new int[M]; // f[j] 表示恰好组成质数集合 j 的方案数
        f[0] = 1; // 质数集合是空集的方案数为 1
        for (int x : nums) {
            int mask = SF_TO_MASK[x];
            if (mask >= 0) // x 是 SF
                for (int j = M - 1; j >= mask; --j)
                    if ((j | mask) == j)  // mask 是 j 的子集
                        f[j] = (f[j] + f[j ^ mask]) % MOD; // 不选 mask + 选 mask
        }
        long ans = 0L;
        for (int v : f) ans += v;
        return (int) ((ans - 1) % MOD); // -1 去掉空集（nums 的空子集）
    }

    //    作者：灵茶山艾府
    //    链接：https://leetcode.cn/problems/count-the-number-of-square-free-subsets/solutions/2121032/liang-chong-xie-fa-01bei-bao-zi-ji-zhuan-3ooi/
    //    来源：力扣（LeetCode）
    //    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

  

}