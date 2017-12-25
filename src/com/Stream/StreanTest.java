package com.Stream;


import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StreamTest&#x6d4b;&#x8bd5;&#x7c7b;
 *
 * @auther wxd
 * @create 2017/12/20
 * @desc StreamTest&#x6d4b;&#x8bd5;&#x7c7b;
 *
 */
public class StreanTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Tom");
        list.add("Hello");
        list.add("World");
        Stream<String> stream = list.stream();//取得Stream类的对象
        //System.out.println(stream.count());//取得数据个数

        /*
         * Stream 类里面提供有一个消除重复的方法；public Stream<T>distinct();
         * 收集器（最后使用收集器）:public  <R,A> R collect(Collector<? super T,A,R>collector);
         * Collectors类：public static<T>Collector<T,?,List<T>>toLsit();
         * 去掉所有的重复数据后形成新的集合数据，里面是不包含重复内容的集合
         */
        //List<String> newList = stream.distinct().collect(Collectors.toList());
        //newList.forEach(System.out :: println);

        /*
         * Stream 类提供有数据过滤的操作：
         * public Stream<T>filter(Predicate<?super T> predicate);
         * 数据过滤
         */
        List<String> list1 = new ArrayList<>();
        list1.add("Android");
        list1.add("Java");
        list1.add("Ios");
        list1.add("jsp");
        list1.add("Oracle");
        Stream<String> stream1 = list1.stream();
        //List<String> filterList = stream1.distinct()
        //        .filter((x) -> x.contains("a"))
        //        .collect(Collectors.toList());
        //filterList.forEach(System.out :: println);
        /*
         * 转大小写: public <R>Stream<R>map(Function<?super T,?extends R>mapper)。
         */
        //List<String> lowCaseList = stream1.distinct()
        //        .map((x) -> x.toLowerCase())
        //        .filter((x) -> x.contains("a"))
        //        .collect(Collectors.toList());
        //lowCaseList.forEach(System.out :: println);
        /*
         *数据集合的分页操作:
         * 设置跳过的数据行数：public Stream<T> skip(long n);
         * 设置取出的数据个数：public Stream<T> limit(long maxSize);
         */
        //List<String> limitList = stream1.distinct()
        //        .map((x) -> x.toLowerCase())
        //        .skip(2).limit(2)
        //        .collect(Collectors.toList());
        //limitList.forEach(System.out :: println);
        /*
         * 数据的全匹配和部分匹配
         * public boolean allMatch(Predicate<?super T> predicate);
         * public boolean anyMatch(Predicate<?super T> predicate);
         * default Predicate<T> add(Predicate<?super T>other);
         * default Predicate<T> or(Predicate<?super T>other);
         *
         */
        //if(stream1.anyMatch((x) -> x.contains("jsp"))){
        //    System.out.println("数据存在！");
        //}
        Predicate<String> predicate = (x) -> x.contains("jsp");
        Predicate<String> predicate1 = (x) -> x.contains("Ios");
        if(stream1.anyMatch(predicate.or(predicate1))){
            System.out.println("数据存在！");
        }
    }
}
