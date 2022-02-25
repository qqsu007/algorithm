package com.joyechina.algorithm.day2;

import com.joyechina.algorithm.util.SortUtil;

/**
 * 归并排序 两个版本 递归版本及非递归版本
 * @author Administrator
 * @date 2020/11/18
 **/
public class Code10_MergeSort {
    /**
     * 递归版 归并排序
      * @param arr
     */
   public static void MergeSortRecursive (int[] arr){
       if(arr==null ||arr.length< SortUtil.MIN_SIZE){
           return;
       }
       processArray(arr,0,arr.length-1);

   }

    private static void processArray(int[] arr, int L, int R) {
        if(L==R){
            return ;
        }
        int mid = L+((R-L)>>2);
        processArray(arr,L,mid);
        processArray(arr,mid+1,R);
        merge(arr,L,mid,R);
    }

    private static void merge(int[] arr, int L, int mid, int R ) {
       int[] copyArray = new int[R-L+1];
       // 记录copy数组中的索引累加器 copy数组从0开始添加 目标数组不一定从0开始
       int i = 0;
       int leftPoint = L;
       int rightPoint = mid+1;

       while (leftPoint<=mid && rightPoint<=R){
           copyArray[i++] = (arr[leftPoint]<=arr[rightPoint]?arr[leftPoint++]:arr[rightPoint++]);
       }
       //当leftpoint 越界时，rightPoint一定小于R
       while (rightPoint<=R){
           copyArray[i++] = arr[rightPoint++];
       }
        //当rightpoint 越界时,leftpoint一定小于mid
        while (leftPoint<=mid){
            copyArray[i++] = arr[leftPoint++];
        }
        for ( i = 0; i < copyArray.length; i++) {
            arr[L+i] = copyArray[i];
        }
    }


    /**
     * 非递归版 归并排序
     * @param arr
     */
    public static void MergeSortNoRecursive (int[] arr){

        if(arr==null ||arr.length< SortUtil.MIN_SIZE){
            return;
        }
        int N = arr.length;
        int step = 1;
        while(step<= N){
            int L = 0;
            while (L<N){
             int M = L+step-1;
             if(M>=N){
                 break;
             }
             int R = Math.min(M+step,N-1);
             merge(arr,L,M,R);
             L= R+1;
            }
            step <<=1;
        }

    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxValue=5000;
        int maxSize = 100;
        boolean flag = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = SortUtil.createRandomArray(maxValue,maxSize);
            int[] arr1 = SortUtil.copyArray(arr);
            MergeSortRecursive(arr);
            MergeSortNoRecursive(arr1);
            // SortUtil.arrySort(arr1);
            if(!SortUtil.isEqual(arr,arr1)){
                flag = false;
                break;
            };
        }
        System.out.println(flag?"nice":"fuck");

    }

}
