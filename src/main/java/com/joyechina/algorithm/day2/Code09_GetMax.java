package com.joyechina.algorithm.day2;

import com.joyechina.algorithm.util.SortUtil;

/**
 * 求arr中的最大值 递归实现
 * @author Administrator
 * @date 2020/11/18
 **/
public class Code09_GetMax {
    public static int getMax(int[] arr){
        if(arr.length<1){
            return 0;
        }
        if(arr.length< SortUtil.MIN_SIZE){
            return arr[0];
        }
        return process(arr,0,arr.length-1);
    }

    private static int process(int[] arr, int L, int R) {
        if(L==R){
            return arr[L];
        }
        /**
         * 求中点
         * 等于 (L+R)/2
         **/
        int mid = L+((R-L)>>1);
        int leftMax = process(arr,L,mid);
        int rightMax = process(arr,mid+1,R);
        return Math.max(leftMax,rightMax);
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxValue = 1000;
        int maxSize = 1000;
        boolean flag = true;
        for (int i = 0; i <testTime ; i++) {
            int[] arr  = SortUtil.createRandomArray(maxValue,maxSize);
            int[] arr1 = SortUtil.copyArray(arr);
            int max1 = SortUtil.getMaxValue(arr);
            int max2 = getMax(arr1);
            if(max1 != max2){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"nice!":"fuck!");
    }
}
