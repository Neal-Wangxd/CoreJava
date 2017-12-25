package com.IO;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 编码测试类
 *
 * @auther wxd
 * @create 2017/12/11
 * @desc 编码测试类
 */
public class EncodingTest {
    public static void main(String[] args) throws  Exception{
        File file  = new File("C:\\Users\\wxd\\Desktop\\CoreJavaCode\\encod.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("这是一个字符编码的测试文本！".getBytes("utf-8"));
        outputStream.close();
    }
}
