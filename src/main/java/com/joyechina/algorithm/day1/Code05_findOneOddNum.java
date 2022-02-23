package com.joyechina.algorithm.day1;

/**
 * 给定一个数组 数组中元素 有一种数 出现奇数次 其余都是偶数次 找到该数
 * 要求，额外空间复杂度O(1),时间复杂度O(n)
 * @author Administrator
 * @date 2021/08/04
 **/
public class Code05_findOneOddNum {
        public static int findOneOddNum(int[] arrays){
            int ans = 0;
            for(int arr : arrays){
                ans = arr^ans;
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] arrs = new int[]{1,2,1,2,3,3,5,4,5};
        System.out.println(findOneOddNum(arrs));
    }
}
