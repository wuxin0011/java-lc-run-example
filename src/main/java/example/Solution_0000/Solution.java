package example.Solution_0000;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: wuxin0011
 * @Description:
 * @url:   <a href="https://leetcode.cn/problems/two-sum">两数之和</a>
 * @title: 两数之和
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class Solution {

    public static void main(String[] args) {
        IoUtil.testUtil(Solution.class,"twoSum","in.txt");
    }
     

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map =  new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
	}

  

}