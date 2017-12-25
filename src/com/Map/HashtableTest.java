package com.Map;


import java.util.Hashtable;
import java.util.Map;

/**
 * Hashtable测试类
 *
 * @auther wxd
 * @create 2017/12/18
 * @desc Hashtable测试类
 * Hashtable 对key和value的数据都不允许设置为null
 * HashMap 与 Hashtable 的区别
 *  HashMap （90%）                Hashtable（10%）
 *  JDK1.2推出                     JDK1.0推出
 *  采用异步处理                   采用同步处理
 *  非线程安全                     线程安全
 *  允许key或value内容为null       不允许key或value为null
 *
 */
public class HashtableTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new Hashtable<String ,Integer>();
        map.put("壹",1);
        map.put("贰",2);
        map.put("叁",3);
        map.put("肆",4);
        //map.put(null,null);
        System.out.println(map);
    }
}
