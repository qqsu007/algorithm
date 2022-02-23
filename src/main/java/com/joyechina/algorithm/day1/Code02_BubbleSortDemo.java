package com.joyechina.algorithm.day1;

import com.joyechina.algorithm.util.SortUtil;

/**
 * @author Administrator
 * @date 2020/11/10
 **/
public class Code02_BubbleSortDemo {

    /**
     * 冒泡排序
     * 冒泡排序(复杂度O(N^2) 稳定)
     * (n-1)->0 范围找最大 大的放右边
     * (n-1)->1范围找最小
     * ...
     * 周而复始
     * @param arr
     */
    public static void BubbleSort(int[] arr){
        if(arr==null ||arr.length< SortUtil.MIN_SIZE){
            return;
        }
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j <i; j++) {
                if(arr[i]<arr[j]){
                    SortUtil.swap(arr,i,j);
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,6,7,3,4,1,12};
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
