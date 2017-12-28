package com.Properties;


import java.util.Properties;

/**
 * Properties测试类
 *
 * @auther wxd
 * @create 2017/12/19
 * @desc Properties测试类
 * Properties 是Hashtable的子类，主要是用来属性操作，
 * 在使用properties类的时候不需要设置泛型类型，因为只保存String，
 * 在properties类里面的主要操作：
 * 设置属性：public Oject setProperty(String key,String value);
 * 取得属性:public String getProperty(String key);若key不存在返回null；
 * 取得属性：public String getProperty(String key,String defaultValue);若key不存在返回默认值
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("BJ","北京");
        properties.setProperty("TJ","天津");
        System.out.println(properties.getProperty("BJ"));
        System.out.println(properties.getProperty("GZ"));
        System.out.println(properties.getProperty("GZ","no data"));
        System.out.println(properties.getProperty("BJ","no data"));
        System.out.println(new java.util.Date().getTime());
    }
}
