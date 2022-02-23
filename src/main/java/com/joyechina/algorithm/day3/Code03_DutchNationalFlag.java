package com.joyechina.algorithm.day3;

import com.joyechina.algorithm.util.SortUtil;

/**
 * 荷兰国旗 三色问题
 * @author Administrator
 * @date 2020/11/23
 **/
public class Code03_DutchNationalFlag {
    /**
     *   小于区域
     *   大于区域
     *   当前指针
     *   if 1.当前数小于给定值，当前值与小于区域下一个交换，小于区域增加一位，当前数跳下一个
     *   if 2.当前数大于给定值，当前值与大于区域下一个交换，大于区域增加一位，当前数不跳
     *   if 3.当前数等于给定值，当前指针直接跳下一个
     *   当前值与大于区域撞上 则停止
     *   返回等于区域的0-n的下标
     * @param arr
     * @param L
     * @param R
     * @return
     */
    public static int[] dutchNationalFlag(int[] arr,int L,int R){
        if (L > R) { // L...R L>R
            return new int[] { -1, -1 };
        }
        if (L == R) {
            return new int[] { L, R };
        }
        int less = L-1;
        int more = R;
        int cur  = L;
        while(cur < more){
            if(arr[cur]<arr[R]){
                SortUtil.swap(arr,cur++,++less);
            }
            else if(arr[cur]==arr[R]){
                cur++;
            }
            else if(arr[cur]>arr[R]){
                SortUtil.swap(arr,cur,--more);
            }
        }
        SortUtil.swap(arr,R,more);
        return new int[] {less+1,more};
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,4,8,6,5};
        int[] ret =  dutchNationalFlag(arr,5,arr.length-1);
        System.out.println("数组下标位："+ret[0]+","+ret[1]);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
