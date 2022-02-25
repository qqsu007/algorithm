package com.joyechina.algorithm.day2.vo;

import java.util.Stack;

/**
 * @author Administrator
 * @date 2020/11/18
 **/
public class MinStack {
    public Stack<Integer> dataStack = new Stack<Integer>();
    public Stack<Integer>  minStack = new Stack<Integer>();

    public void push(int i){
        dataStack.push(i);
        if (minStack.isEmpty()) {
            minStack.push(i);
        } else {
            minStack.push(Math.min(i, minStack.peek()));
        }
    }
    public int  pop(){
        minStack.pop();
        return dataStack.pop();
    }
    public  int getMinValue(){
        return minStack.peek();
    }
}
