package com.Static;


/**
 * 测试关键字static的一些特点
 *
 * @auther wxd
 * @create 2018/3/19
 * @desc 测试关键字static的一些特点
 * 1.static 声明的属性与普通属性最大的区别在于保存的内存区域不同
 * 2.利用static定义的属性是可以由类名直接调用的
 * 3.所有非static属性必须产生实例化对象后才可以访问,但是static属性不受实例对象的限制，
 *   也就是说，在没有实例化对象产生的情况下，依然可以使用static
 * 4.如果需要描述出共享信息的时候，使用static
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
