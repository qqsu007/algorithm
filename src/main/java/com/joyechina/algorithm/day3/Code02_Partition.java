package com.joyechina.algorithm.day3;

import com.joyechina.algorithm.util.SortUtil;

/**
 *
 * @author Administrator
 * @date 2020/11/23
 **/
public class Code02_Partition {
    /**
     * 小于区域
     * 大于区域
     * 当前指针
     * if 1.当前数小于给定值，当前值与小于区域下一个交换，小于区域增加一位，当前数跳下一个
     * if 2.当前数大于给定值，当前值与大于区域下一个交换，大于区域增加一位，当前数不跳
     * if 3.当前数等于给定值，当前指针直接跳下一个
     * 当前值与大于区域撞上 则停止
     * 返回等于区域的0-n的下标
     * @param arr
     * @param num
     */
    public static int[] partition(int[] arr,int num){
        int minArea = -1;
        int maxArea = arr.length;
        int cur = 0;
        int[] arrReturn ;
      while (cur < maxArea){
          if(arr[cur]<num){
              SortUtil.swap(arr,cur++,++minArea);
          }else if(arr[cur]==num){
              cur++;
          } else{
            SortUtil.swap(arr,cur,--maxArea);
          }
      }
      return new int[]{minArea+1,maxArea};
    }
    public static void main(String[] args) {
        int[] arr = {3,4,0,7,4,5,1,6};
        int[] ret =  partition(arr,4);
        System.out.println("数组下标位："+ret[0]+","+ret[1]);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
