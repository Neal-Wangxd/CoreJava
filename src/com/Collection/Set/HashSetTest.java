package com.Collection.Set;


import java.util.HashSet;
import java.util.Set;

/**
 * set集合测试类
 *
 * @auther wxd
 * @create 2017/12/17
 * @desc set集合测试类
 */
public class HashSetTest {
    public static void main(String[] args) {
        /**
         * set 里面没有重复数据，并且数据没有顺序，即HashSet子类属于无需排列
         */
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Tom");
        hashSet.add("Hello");
        hashSet.add("World");
        System.out.println(hashSet);
    }
}
