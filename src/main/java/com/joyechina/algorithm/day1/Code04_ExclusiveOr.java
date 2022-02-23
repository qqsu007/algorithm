package com.joyechina.algorithm.day1;

/**
 * 异或demo
 * @author Administrator
 * @date 2020/11/12
 **/
public class Code04_ExclusiveOr {
    /**
     * 不用额外变量，交换两个变量值
     * 若两个变量内存地址一样 交换失效并且结果为0
     * @param i
     * @param j
     */
    public static void swap1(int i, int j){
        System.out.println("swap1 交换前数据i ="+i+"; j = "+j+"; ");
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.println("swap1 交换之后数据i ="+i+"; j = "+j+"; ");
    }
    /**
     * 不用额外变量，交换两个变量值
     * @param i
     * @param j
     */
    public static void swap2(int i, int j){
        System.out.println("swap2 交换前数据i ="+i+"; j = "+j+"; ");
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("swap2 交换之后数据i ="+i+"; j = "+j+"; ");
    }

    public static void main(String[] args) {
        swap1(1,3);
        swap2(1,3);


    }
}
