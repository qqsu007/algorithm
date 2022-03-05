package com.joyechina.algorithm.day6;

import java.util.Stack;

/**
 *  二叉树结构 1递归/2非递归
 * @author Administrator
 * @date 2022/03/05
 **/
public class Code01_BinaryTree {
    public static void main(String[] args) {
        Node nodeA= new Node("A");
        Node nodeB= new Node("B");
        Node nodeC= new Node("C");
        Node nodeD= new Node("D");
        Node nodeE= new Node("E");
        Node nodeF= new Node("F");
        Node nodeG= new Node("G");
        nodeA.left = nodeB;
        nodeA.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeC.left = nodeF;
        nodeC.right = nodeG;
     //   binaryTreePre1(nodeA);
      //  binaryTreeIn1(nodeA);
      //  binaryTreePost1(nodeA);
   //     binaryTreePre2(nodeA);
        binaryTreePost2(nodeA);
    }
    public static class Node{
        public Node(String value) {
            this.value = value;
        }

        public String value;
        public Node left;
        public Node right;
    }
    /**
     * 先序 头左右
     */
    public static void binaryTreePre1(Node node){
        if(node==null){
            return ;
        }
        System.out.println(node.value);
        binaryTreePre1(node.left);
        binaryTreePre1(node.right);
    }
    public static void binaryTreePre2(Node node){
        Stack<Node> stack = new Stack();
        stack.add(node);
        while(!stack.empty()){
            node = stack.pop();
            System.out.println(node.value);
            if(null !=node.right){stack.add(node.right);}
            if(null !=node.left){stack.add(node.left);}
        }
    }
    /**
     * 中序 左头右
      */
    public static void binaryTreeIn1(Node node){
        if(node==null){
            return ;
        }
        binaryTreeIn1(node.left);
        System.out.println(node.value);
        binaryTreeIn1(node.right);
    }

    /***
     * 后序 左右头
     */
    public static void binaryTreePost1(Node node){
        if(node==null){
            return ;
        }
        binaryTreePost1(node.left);
        binaryTreePost1(node.right);
        System.out.println(node.value);
    }
    public static void binaryTreePost2(Node node){
        Stack<Node> stack = new Stack();
        Stack<Node> stack2 = new Stack();
        stack.add(node);
        while(!stack.empty()){
            node = stack.pop();
            stack2.add(node);
            if(null !=node.left){stack.add(node.left);}
            if(null !=node.right){stack.add(node.right);}
        }
        while (!stack2.empty()){
            System.out.println(stack2.pop().value);
        }
    }
}
