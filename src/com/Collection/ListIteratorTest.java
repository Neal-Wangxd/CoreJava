package com.Collection;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 双向迭代测试类
 *
 * @auther wxd
 * @create 2017/12/18
 * @desc 双向迭代测试类
 *  若要支持双向输出，就需要使用Iterator 的子接口----ListIterator接口，
 *  判断是否有前一个元素:public boolean hasPrevious();
 *  取得前一个元素：public E previous();
 *  ListIterator 是专门为List子接口输出的，public ListIterator<E>listIterator();
 *  如果想实现由后向前的输出操作之前，必须要先发生右前向后输出。
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        System.out.println("由前向后输出:");
        ListIterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"、");
        }
        System.out.println("\n由后向前输出：");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous()+"、");
        }

    }
}
