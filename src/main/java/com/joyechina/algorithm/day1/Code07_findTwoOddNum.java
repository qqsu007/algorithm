package com.joyechina.algorithm.day1;

/**
 * 给定一个数组 数组中元素 有两种数出现奇数次 其余都是偶数次 找到该数
 * @author Administrator
 * @date 2020/11/18
 **/
public class Code07_findTwoOddNum {

    public static String findTwoOddNum(int[] array){
        int eor = 0;
        for(int i=0;i<array.length;i++){
           eor ^= array[i];
        }
        //此时eor 的结果为 两个奇数次的数 异或 a^b
        //lastOne 为找出a^b 最右侧的 1
        int lastOne = eor & (-eor);
        int onlyOneTimes = 0;
        for(int i=0;i<array.length;i++){
            //array[i]^ （a^b）最右侧的一 将原始数组分流 a与b必定可以分开
            if((array[i] & lastOne)!=0){
                onlyOneTimes ^=array[i];
            }
        }
        System.out.println("one is :"+onlyOneTimes+"; another is: "+ (onlyOneTimes^eor));
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,33,33,44,44,55,55};
        findTwoOddNum(arr);
    }
}
