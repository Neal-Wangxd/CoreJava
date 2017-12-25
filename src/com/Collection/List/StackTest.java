package com.Collection.List;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Stack;

/**
 * stack测试类
 *
 * @auther wxd
 * @create 2017/12/19
 * @desc stack测试类
 * Stack表示栈操作，栈是一种先进后出的数据结构，stack是Vector的子类
 * 但是它不会使用Vector类的方法，使用自己的方法
 * 入栈：public E push(E item);
 * 出栈：public E pop();
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());//当栈中已经没有数据时会抛出EmptyStackException异常
    }
}
