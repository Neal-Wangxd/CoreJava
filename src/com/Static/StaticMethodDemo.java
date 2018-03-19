package com.Static;


/**
 * static 静态方法测试
 *
 * @auther wxd
 * @create 2018/3/19
 * @desc static 静态方法测试
 *
 * static方法不能够直接访问非static属性或者方法，只能够调用static属性和方法
 * 非static方法可以访问static的属性或者方法，不收任何的限制
 * 如果在一个类里面没有任何的属性存在，只有方法，建议将所有的方法设置为static，这样
 * 就不用每次调用的时候实例化对象
 */
public class StaticMethodDemo {
    public static void main(String[] args) {
        /*BookOne.setPub("北京大学出版社");
        BookOne booka = new BookOne("Java开发",88.9);
        BookOne bookb = new BookOne("Python开发",78.9);
        System.out.println(booka);
        System.out.println(bookb);*/
        //outTest();
        new StaticMethodDemo().outTest();
    }

    //当加了static关键字时，main方法可以直接调用，不加static时，只能通过对象调用
    //public static void outTest(){
    public  void outTest(){
        System.out.println("Hello World!");
    }
}

class BookOne{
    private String name;
    private double price;
    private static String pub = "清华大学出版社";

    public BookOne(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void setPub(String pubOne){
        pub = pubOne;
        //toString();
    }

    @Override
    public String toString() {
        return "BookOne{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pub='" + pub + '\'' +
                '}';
    }
}
