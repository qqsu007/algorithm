package com.joyechina.algorithm.day2;

import com.joyechina.algorithm.day2.vo.DubboNode;
import com.joyechina.algorithm.day2.vo.SingleNode;

/**
 * 链表反转
 * 包含单链表 双链表
 * @author Administrator
 * @date 2020/11/16
 **/
public class Code01_ReverseLinkedList {
    /**
     * 单链表反转
     * 	  a    ->   b    ->  c  ->  null
     * 	  c    ->   b    ->  a  ->  null
     * @param head
     * @return
     */
    public static SingleNode reverseSingleLinkedList(SingleNode head){
        SingleNode pre = null;
        SingleNode next = null;
        while (head!=null){
            /**1.记录当前节点下一个节点环境*/
            next = head.getNext();
            /**2.将当前节点下一个设置为上一个node*/
            head.setNext(pre);
            /**3.把上个节点设置成当前节点*/
            pre = head;
            /**4.将节点下一个环境赋值给当前节点 */
            head = next;
        }
        return pre;
    }


    /**
     * 双向链表反转
     * @param head
     * @return
     */
    public static DubboNode reverseDubboLinkedList(DubboNode head){
        DubboNode pre = null;
        DubboNode next = null;
        while (head!=null){
            /**1.保存当前节点下一个节点环境*/
            next = head.getNext();
            /**2.将当前节点下一个设置为上一个node*/
            head.setNext(pre);
            /**3.将当前节点上一个设置为下一个node*/
            head.setPre(next);
            /**4.把上个节点设置成当前节点*/
            pre = head;
            /**5.将当前节点下一个节点环境赋值给当前节点 */
            head = next;
        }
        return pre;
    }
    public static void main(String[] args) {
        SingleNode node3 = new SingleNode(3);
        SingleNode node2 = new SingleNode(2,node3);
        SingleNode node1 = new SingleNode(1,node2);
        SingleNode node4 = reverseSingleLinkedList(node1);
        System.out.println(node4);
    }

}
