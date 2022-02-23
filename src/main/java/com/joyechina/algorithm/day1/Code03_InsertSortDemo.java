package com.joyechina.algorithm.day1;

import com.joyechina.algorithm.util.SortUtil;

/**
 * @author Administrator
 * @date 2020/11/10
 **/
public class Code03_InsertSortDemo {
    /**
     * 插入排序
     * 经典插入排序(复杂度O(N^2)[渐近线上界] 稳定 受数据状况影响)
     * 0->0 范围有序
     * 0->1 范围有序 眼睛看着1位置(往前看,左边的数字比自己大交换）循环  直到不比自己大不换或者前为0
     * ...
     * 周而复始
     * @param arr
     */
    public static void InsertSort(int[] arr){
        if(arr==null ||arr.length< SortUtil.MIN_SIZE){
            return;
        }

        for (int i = 1; i <arr.length ; i++) {
            for (int j = i-1; j >=0 && arr[j]>arr[j+1]; j--) {
                SortUtil.swap(arr,j,j+1);
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,6,7,3,4,1,12};
        InsertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
