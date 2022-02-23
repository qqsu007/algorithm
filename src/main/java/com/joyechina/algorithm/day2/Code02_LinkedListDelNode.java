package com.joyechina.algorithm.day2;

import com.joyechina.algorithm.day2.vo.DubboNode;
import com.joyechina.algorithm.day2.vo.SingleNode;

/**
 * 单双链表删除节点
 * @author Administrator
 * @date 2020/11/16
 **/
public class Code02_LinkedListDelNode {
    public static SingleNode removeSingleNodeValue(SingleNode head, int num){
        //找到第一个不是要删除的节点值，若没有找到则链表需要全部删除
        while(head!=null){
            if(head.getValue()!=num){
                break;
            }
            head = head.getNext();
        }

        SingleNode pre = head;
        SingleNode current = head;
        while (current!=null){
            if(current.getValue()==num){
                pre.setNext(current.getNext());
            }else{
                pre = current;
            }
            current = current.getNext();
        }
        return current;
    }
    public static DubboNode removeDubboNodeValue(DubboNode head, int num){
        return null;
    }
    public static void main(String[] args) {

    }

}
