package com.Map;


import java.util.HashMap;
import java.util.Map;

/**
 * map的测试类
 *
 * @auther wxd
 * @create 2017/12/18
 * @desc map的测试类
 * Map接口用来保存一对关联数据（key=value），
 * public V put(K key,V value); 向集合中保存数据
 * public V get(Object key); 根据key查找对应的value数据
 * public Set<Map.Entry<K,V>> entrySet(); 将Map集合转化为Set集合
 * public Set<K> keySet(); 取出全部的key
 * Map 接口下有两个常用子类：HashMap，Hashtable
 */
public class HashMapTest {
    public static void main(String[] args) {

        /**
         * 使用HashMap定义的Map集合是无序存放的
         * 若有重复的key会进行覆盖，使用新的value替换掉旧的value
         * get()方法用来根据key查找所需要的value
         * Map 存放数据的最终目的实际上是为了信息的查找，但是Collection 存放数据是为了输出
         */
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("壹",1);
        map.put("贰",2);
        map.put("叁",3);
        map.put("肆",4);
        map.put("肆",44);
        map.put(null,0);//key 的value为null
        System.out.println(map);
        System.out.println(map.get("叁"));
        System.out.println(map.get("伍"));//若key不存在返回null
        System.out.println(map.get(null));

    }
}
