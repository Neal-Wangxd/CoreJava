package com.Map;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Iterator输出的测试类
 *
 * @auther wxd
 * @create 2017/12/18
 * @desc Iterator输出的测试类
 * 当使用put()方法向Map集合里保存一对数据的时候，实际上数据会被自动封装为Map.Entry接口对象
 * public static interface Map.Entry<K,V>
 *    这个接口里有两个操作：
 *    取得key:public K getKey();
 *    取得value: public V getValue();
 *
 *    在Map接口里定义了一个将Map集合转化为set集合的方法：public Set<Map.Entry<K,V>>entrySet();
 *    利用Map接口的entrySet()方法将Map集合变化为Set集合，里面的泛型是Map.Entry;
 *    利用Set集合中的iterator()方法将Set集合进行Iterator输出；
 *    每一次Iterator循环取出的都是Map.Entry接口对象，利用此对象进行key与value的取出。
 *
 */
public class IteratorTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new Hashtable<String,Integer>();
        map.put("壹",1);
        map.put("贰",2);
        map.put("叁",3);
        map.put("肆",4);
        //将Map集合变为Set集合，目的是为了使用iterator()方法
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> ma = iterator.next();
            System.out.println(ma.getKey()+" = "+ma.getValue());
        }

    }
}
