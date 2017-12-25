package com.Collection.Set;


import java.util.Set;
import java.util.TreeSet;

/**
 * 关于TreeSet排序的测试类
 *
 * @auther wxd
 * @create 2017/12/17
 * @desc 关于TreeSet排序的测试类
 */
public class TreeSetForObjTest {
    /**
     * 集合是一个动态的对象数组，若要为一组对象进行排序，必须使用比较器，应该使用Comparable完成比较
     * 在比较的方法里面需要将这个类的所有属性都一起参与到比较之中
     * TreeSet 主要依靠Comparable接口中的compareTo()方法判断是否重复数据，若返回的是0，则表示重复数据
     * @param args
     */
    public static void main(String[] args) {
        Set<Book> book = new TreeSet<Book>();
        book.add(new Book("Java开发",79.8));
        book.add(new Book("Jsp开发",79.8));
        book.add(new Book("Angular开发",69.8));
        book.add(new Book("Java开发",79.8));
        System.out.println(book);
    }
}

class Book implements  Comparable<Book>{
    private String title;
    private double price;

    public Book(String title,double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名："+ this.title +",价格："+this.price +"\n";
    }

    @Override
    public int compareTo(Book o) {
        if(this.price > o.price){
            return 1;
        }else if(this.price < o .price){
            return -1;
        }else{
            return this.title.compareTo(o.title);
        }
    }
}
