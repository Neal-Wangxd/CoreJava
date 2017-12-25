package com.Collection.List;


import java.util.ArrayList;
import java.util.List;

/**
 * List保存对象测试类
 *
 * @auther wxd
 * @create 2017/12/16
 * @desc List保存对象测试类
 */
public class ListForObjTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Java开发",79.8));
        bookList.add(new Book("Java高并发开发",79.8));
        bookList.add(new Book("Jsp开发",69.8));
        bookList.add(new Book("Oracle开发",99.8));
        //任何情况下集合数据的删除和查询都必须提供有equals()方法
        bookList.remove(new Book("Java开发",79.8));
        System.out.println(bookList);
    }
}

class Book {
    private String title;
    private double price;

    public Book(String title ,double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(null == obj){
            return false;
        }

        if(obj instanceof Book){
            return true;
        }
        Book book = (Book) obj;
        if(this.title.equals(((Book) obj).title) && this.price == ((Book) obj).price){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "书名："+this.title+",价格:"+this.price+"\n";
    }
}
