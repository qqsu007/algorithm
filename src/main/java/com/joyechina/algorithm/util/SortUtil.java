package com.joyechina.algorithm.util;

import java.util.Arrays;

/**
 * @author Administrator
 * @date 2020/11/10
 **/
public class SortUtil {
    public static final int MIN_SIZE = 2;
    public static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

   public  static int[] createRandomArray(int maxValue,int maxSize){
        int length = (int) (Math.random()*maxSize);
        int[] arr = new int[length];
        for (int i = 0; i <length ; i++) {
          arr[i] = (int) (Math.random()*maxValue)  -  (int) (Math.random()*maxValue);
        }
        return arr;
   }

    public static int[] copyArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public static void arrySort(int[] arr){
        Arrays.sort(arr);
    }

    public static int getMaxValue(int[] arr){
        if(arr.length<1){
            return 0;
        }
        int max  = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static boolean isEqual(int[] arr,int[] arr1 ){
        boolean flag = true;
        if(arr.length !=arr1.length){return  false;}
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=arr1[i]){
              flag = false;
              break;
            }
        }
        return flag;
    }
}
