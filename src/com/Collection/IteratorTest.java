package com.Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 集合类的输出测试
 *
 * @auther wxd
 * @create 2017/12/18
 * @desc 集合类的输出测试
 *  Iterator 本身是一个接口，如果想取得本接口实例化只能依靠Collection接口，
 *  在Collection接口里面定义有public Iterator<E>iterator();
 */
public class IteratorTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("崔克");
        hashSet.add("自行车");
        hashSet.add("崔克");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
