package com.joyechina.algorithm.day2.vo;

/**
 * @author Administrator
 * @date 2020/11/17
 **/
public class DubboNode {
    private int value;
    private DubboNode pre;
    private DubboNode next;

    public DubboNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DubboNode getPre() {
        return pre;
    }

    public void setPre(DubboNode pre) {
        this.pre = pre;
    }

    public DubboNode getNext() {
        return next;
    }

    public void setNext(DubboNode next) {
        this.next = next;
    }
}
