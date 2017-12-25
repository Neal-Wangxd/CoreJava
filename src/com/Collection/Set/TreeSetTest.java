package com.Collection.Set;


import java.util.Set;
import java.util.TreeSet;

/**
 * treeSet测试类
 *
 * @auther wxd
 * @create 2017/12/17
 * @desc treeSet测试类
 */
public class TreeSetTest {
    public static void main(String[] args) {
        /**
         * TreeSet数据没有重复，并且是排序的
         */
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("C");
        System.out.println(treeSet);

    }
}
