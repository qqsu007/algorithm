package com.joyechina.algorithm.day2.vo;

/**
 * @author Administrator
 * @date 2020/11/18
 **/
public  class ArrayStack {
    private int[] arr;
    private int begin;
    private int end;
    private int  size;
    private final int limit ;

    public ArrayStack(int limit) {
        this.arr = new int[limit];
        this.limit = limit;
        this.begin = 0;
        this.end = 0;
        this.size=0;
    }
    public  void push(int num){
        if(size==limit){
            throw  new RuntimeException("已满 不能添加");
        }

    };
    public  int pop(){
        return 0;
    };
}
