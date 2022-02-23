package com.joyechina.algorithm.day3;

import com.joyechina.algorithm.util.SortUtil;

/**
 * 快排
 * @author Administrator
 * @date 2020/11/23
 **/
public class Code04_QuickSort {
    public static void quickSort(int[] arr){
        if(arr==null ||arr.length< SortUtil.MIN_SIZE){
            return;
        }
        process3(arr,0,arr.length-1);
    }

    private static void process3(int[] arr, int L, int R) {
        // L...R L>R
        if(L>=R){
            return ;
        }
      //  int randomNum = L+(int)(Math.random()*(R-L+1));
      //  SortUtil.swap(arr,R,randomNum);
        int[] equalArea= Code03_DutchNationalFlag.dutchNationalFlag(arr,L,R);
        process3(arr,L,equalArea[0]-1);
        process3(arr,equalArea[1]+1,R);
    }

    public static void main(String[] args) {
//        int[] arrs = new int[]{0,34,54,0};
//        quickSort(arrs);
//        for (int i = 0; i <arrs.length ; i++) {
//            System.out.println(arrs[i]);
//        }
        int times = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean flag = true;
        for (int i = 0; i < times; i++) {
            int[] arrOrgin =  SortUtil.createRandomArray(maxValue,maxSize);
            int[] arr =  SortUtil.copyArray(arrOrgin);
            int[] arr2 = SortUtil.copyArray(arr);
            quickSort(arr);
            SortUtil.arrySort(arr2);
            if(!SortUtil.isEqual(arr,arr2)){
                System.out.println("arrOrgin:");
                for (int j = 0; j < arrOrgin.length; j++) {
                    System.out.print(arrOrgin[j]+",");
                }
                System.out.println("");
                System.out.println("arr:");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]+",");
                }
                System.out.println("");
                System.out.println("arr2:");
                for (int j = 0; j < arr2.length; j++) {
                    System.out.print(arr2[j]+",");
                }
                System.out.println("");
                flag = false;
                break;
            }
        }
        System.out.println((flag)? "good":"fuck");
    }
}
