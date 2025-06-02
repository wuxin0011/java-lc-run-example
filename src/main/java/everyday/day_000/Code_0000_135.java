package everyday.day_000;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: wuxin0011
 * @Description:
 * @url:   <a href="https://leetcode.cn/problems/candy">分发糖果</a>
 * @title: 分发糖果
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class Code_0000_135 {

    public static void main(String[] args) {
        IoUtil.testUtil(Code_0000_135.class,"candy","txt_file\\Code_0000_135.txt");
    }


    public int candy(int[] ratings) {
        int n = ratings.length;
        int ans = n; // 先给每人分一个
        for (int i = 0; i < n; i++) {
            int start = i > 0 && ratings[i - 1] < ratings[i] ? i - 1 : i;

            // 找严格递增段
            while (i + 1 < n && ratings[i] < ratings[i + 1]) {
                i++;
            }
            int top = i; // 峰顶

            // 找严格递减段
            while (i + 1 < n && ratings[i] > ratings[i + 1]) {
                i++;
            }

            int inc = top - start; // start 到 top 严格递增
            int dec = i - top;     // top 到 i 严格递减
            ans += (inc * (inc - 1) + dec * (dec - 1)) / 2 + Math.max(inc, dec);
        }
        return ans;
    }

//    作者：灵茶山艾府
//    链接：https://leetcode.cn/problems/candy/solutions/3691236/fen-zu-xun-huan-ba-kun-nan-ti-bian-cheng-fo15/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
  

}