package com.Collection.Set;


import java.util.HashSet;
import java.util.Set;

/**
 * 关于重复元素的测试类
 *
 * @auther wxd
 * @create 2017/12/17
 * @desc Comparable接口只能负责TreeSet子类进行重复元素的判断，他并不是正真的用于能够进行重复元素的验证
 * 要进行重复元素的判断只能够依靠Object类中所提供的方法
 * 取得哈希码：public int hashCode(); 先判断哈希码是否相同，再根据哈希码取得一个对象的内容
 * 对象比较：public boolean equals(Object obj); 再将对象的属性进行比较
 *
 */
public class HashSetForObjTest {
    public static void main(String[] args) {
        Set<BookNew> bookNewSet = new HashSet<BookNew>();
        bookNewSet.add(new BookNew("Java开发",79.8));
        bookNewSet.add(new BookNew("Jsp开发",79.8));
        bookNewSet.add(new BookNew("Angular开发",69.8));
        bookNewSet.add(new BookNew("Java开发",79.8));
        System.out.println(bookNewSet);
    }
}


class BookNew {

    private String title;
    private double price;

    public BookNew(String title,double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookNew{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}'+"\n";
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookNew book = (BookNew) o;

        if (Double.compare(book.price, price) != 0) return false;
        return title != null ? title.equals(book.title) : book.title == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
