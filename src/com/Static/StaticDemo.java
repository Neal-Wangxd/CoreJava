package com.Static;


/**
 * 测试关键字static的一些特点
 *
 * @auther wxd
 * @create 2018/3/19
 * @desc 测试关键字static的一些特点
 *
 *
 */
public class StaticDemo {
    public static void main(String[] args) {
        Book booka = new Book("Java开发",88.9);
        Book bookb = new Book("Python开发",78.9);
        Book bookc = new Book("Oracle发",68.9);
        Book bookd = new Book("Vue开发",58.9);
        bookd.pub = "北京大学出版社";
        System.out.println(booka);
        System.out.println(bookb);
        System.out.println(bookc);
        System.out.println(bookd);
    }
}

class Book{
    String name;
    double price;

    static String pub = "清华大学出版社";

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pub='" + pub + '\'' +
                '}';
    }
}
