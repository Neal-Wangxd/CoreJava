package com.Collection;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections集合的工具类测试
 *
 * @auther wxd
 * @create 2017/12/19
 * @desc Collections集合的工具类测试
 * Collection 与 Collections 的区别
 * Collection 是集合操作的接口；
 * Collections 是集合操作的工具类，可以进行List、Set、Map 集合的操作。
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"A","B","C","D","E");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
