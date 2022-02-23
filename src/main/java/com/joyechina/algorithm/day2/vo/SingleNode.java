package com.joyechina.algorithm.day2.vo;

/**
 * 基础单链表
 * @author Administrator
 * @date 2020/11/17
 **/
public class SingleNode {

    public SingleNode(int value) {
        this.value = value;
    }

    public SingleNode(int value, SingleNode next) {
        this.value = value;
        this.next = next;
    }

    private int value;
    private SingleNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
