package com.joyechina.algorithm.day1;

/**
 * 给定一个数 找到最右侧的1
 * @author Administrator
 * @date 2021/11/18
 **/
public class Code06_findRightOne {
    public static int findRightOne(int num){
        //System.out.println("原始数字二进制形式");
        printNum(num);
      //  System.out.println("提取最右侧的1之后二进制形式");
        printNum(num &(-num));
        return num &(-num);
    }

    public static  void printNum(int num){
        for(int i =31; i>= 0; i--){
            System.out.print(((num >> i) & 1));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int i =12312321;
        int j = 123453787;
       printNum(i);
       printNum(j);
        System.out.println("i&j-------------------------");//
        printNum(i&j);
        System.out.println("end=======================");
        System.out.println();
        printNum(i);
        printNum(j);
        System.out.println("i|j-------------------------");
        printNum(i|j);
        System.out.println("end=======================");
        System.out.println();
        printNum(i);
        printNum(j);
        System.out.println("i^j-------------------------");
        printNum(i^j);
        System.out.println();
       System.out.println(findRightOne(124));
    }

}
