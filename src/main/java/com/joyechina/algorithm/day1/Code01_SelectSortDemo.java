package com.joyechina.algorithm.day1;

import com.joyechina.algorithm.util.SortUtil;

/**
 * @author Administrator
 * @date 2020/11/10
 **/
public class Code01_SelectSortDemo {

    /**
     * 选择排序
     * (复杂度O(N^2) 不稳定)
     * 0->(n-1) 范围找最小
     * 1->(n-1)范围找最小
     * ...
     * 周而复始
     * @param arr
     */
    public static void selectSort(int[] arr){
        if(arr==null ||arr.length< SortUtil.MIN_SIZE){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j <arr.length ; j++) {
                minIndex =arr[j] < arr[minIndex] ?  j: minIndex;
            }
            SortUtil.swap(arr,i,minIndex);
        }
    }

    public static void main(String[] args) {
        int times = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean flag = true;
        for (int i = 0; i < times; i++) {
           int[] arr =  SortUtil.createRandomArray(maxValue,maxSize);
           int[] arr2 = SortUtil.copyArray(arr);
            selectSort(arr);
            SortUtil.arrySort(arr2);
            if(!SortUtil.isEqual(arr,arr2)){
                System.out.println("arr:"+arr);
                System.out.println("arr2:"+arr2);
                flag = false;
                break;
            }
        }
        System.out.println((flag)? "good":"fuck");
    }


}


