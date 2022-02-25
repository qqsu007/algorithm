package com.joyechina.algorithm.day2.vo;

/**
 * @author Administrator
 * @date 2020/11/18
 **/
public  class ArrayQueue{
    private int[] arr;
    private int begin;
    private int end;
    private int  size;
    private final int limit ;

    public ArrayQueue(int limit) {
        this.arr = new int[limit];
        this.limit = limit;
        this.begin = 0;
        this.end = 0;
        this.size=0;
    }
    public  void push(int num){
        if(size==limit){
            throw  new RuntimeException("队列已满 不能添加");
        }
        size++;
        arr[end] = num;
        end = nextIndex(end);
    }
    public  int pop(){
        if(size==0){
            throw  new RuntimeException("队列已空 不能弹出");
        }
        size--;
        int num = arr[begin];
        begin = nextIndex(begin);
        return num;
    };


    private int nextIndex(int num) {
        return num<limit-1?num+1:0;
    }
}
