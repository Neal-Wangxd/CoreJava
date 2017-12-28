package com.Stream;


import java.util.ArrayList;
import java.util.List;

/**
 * forEach方法测试
 *
 * @auther wxd
 * @create 2017/12/20
 * @desc forEach方法测试
 */
public class ForEachTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Tom");
        list.add("Hello");
        list.add("Neal");
        list.forEach(System.out :: println);

    }
}
