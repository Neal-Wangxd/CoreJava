package com.Collection.List;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Vector测试类
 *
 * @auther wxd
 * @create 2017/12/16
 * @desc Vector测试类
 */
public class VectorTest {
    public static void main(String[] args) {
        //设置泛型，保证集合中所有数据类型的一致
        List<String> list = new Vector<>();
        System.out.println("长度："+list.size()+",是否为空"+list.isEmpty());
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        System.out.println("长度："+list.size()+",是否为空"+list.isEmpty());
        //Collection 接口定义了size() 方法可以获取集合长度
        //List 子接口扩充了一个get()方法，可以根据索引取得数据
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //List集合之中保存的数据是按照保存的顺序存放的，而且允许存在有重复数据。
    }
}
