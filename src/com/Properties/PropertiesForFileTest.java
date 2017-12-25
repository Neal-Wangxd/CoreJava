package com.Properties;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Properties对文件的操作
 *
 * @auther wxd
 * @create 2017/12/19
 * @desc Properties对文件的操作
 * Properties 类里面提供有数据的传输操作：
 * 将属性保存在文件中：public void store(OutputStream out,String comments) throws IOException;
 * 从指定的输入流中读取属性信息:public void load(InputStream  inStream)throws IOException;
 */
public class PropertiesForFileTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        //properties.setProperty("BJ","北京");
        //properties.setProperty("TJ","天津");
        //properties.store(new FileOutputStream(new File("C:\\Users\\wxd\\Desktop\\CoreJavaCode\\test.properties")),"testProperties");
        properties.load(new FileInputStream(new File("C:\\Users\\wxd\\Desktop\\CoreJavaCode\\test.properties")));
        System.out.println(properties.getProperty("BJ"));
    }
}
