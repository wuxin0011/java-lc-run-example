package contest.weekly.w_300.w_333;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: agitated-curranfnd
 * @Description:
 * @url:   <a href="https://leetcode.cn/contest/weekly-contest-333/problems/merge-two-2d-arrays-by-summing-values">合并两个二维数组 - 求和法</a>
 * @title: 合并两个二维数组 - 求和法
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class A {

    public static void main(String[] args) {
        IoUtil.testUtil(A.class,"mergeArrays","A.txt");
    }


    static int[][] f = new int[401][2];

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Arrays.sort(nums1,(a,b)->a[0] - b[0]);
        Arrays.sort(nums2,(a,b)->a[0] - b[0]);
        int n = nums1.length,m = nums2.length;
        int size = 0;
        int i = 0,j = 0;
        for(; i < n && j < m ;) {
            if(nums1[i][0] == nums2[j][0]) {
                f[size][0] = nums1[i][0];
                f[size++][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]) {
                f[size][0] = nums1[i][0];
                f[size++][1] = nums1[i][1];
                i++;
            }else if(nums1[i][0] > nums2[j][0]) {
                f[size][0] = nums2[j][0];
                f[size++][1] = nums2[j][1];
                j++;
            }
        }

        for(; i < n  ;i++) {
            f[size++] = nums1[i];
        }

        for(; j < m ;j++) {
            f[size++] = nums2[j];
        }

        int[][] ans = new int[size][2];
        for(i = 0;i < size;i++) {
            ans[i] = f[i];
        }
        return ans;
    }

  

}