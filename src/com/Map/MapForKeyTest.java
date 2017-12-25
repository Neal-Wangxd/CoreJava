package com.Map;


import java.util.HashMap;
import java.util.Map;

/**
 * Map集合中关于key 的说明
 *
 * @auther wxd
 * @create 2017/12/19
 * @desc Map集合中关于key 的说明
 * 在使用Map接口时，可以使用任意类型作为key或value，即也可以使用自定义类型作为key，
 * 但是这个作为key的自定义类必须重写Object类中的hashCode()与equals()两个方法，
 * 只有靠这两个方法 才能确定元素是否重复。
 *
 */
public class MapForKeyTest {
    public static void main(String[] args) {
        Map<MapBook,String> map = new HashMap<MapBook,String>();
        map.put(new MapBook("Java开发1",79.8),"Java开发相关书籍(基础)");
        map.put(new MapBook("Java开发2",89.8),"Java开发相关书籍(高级)");
        System.out.println(map);
        System.out.println(map.get(new MapBook("Java开发1",79.8)));
    }
}

class MapBook{
    private String title;
    private double price;

    public MapBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MapBook{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapBook mapBook = (MapBook) o;

        if (Double.compare(mapBook.price, price) != 0) return false;
        return title != null ? title.equals(mapBook.title) : mapBook.title == null;
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
