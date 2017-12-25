package com.IO;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.function.Consumer;

/**
 * 打印流的测试类
 *
 * @auther wxd
 * @create 2017/12/13
 * @desc 打印流的测试类
 */
public class PrintTest {
    public static void main(String[] args) throws  Exception{
        //OutputStream out = System.out;
        //out.write("Hello World".getBytes());

        //jdk1.8 的函数式引用
        //Consumer<String> con = System.out :: print;
        //con.accept("Hello World!");

        //输入信息的测试
       /* InputStream input  = System.in;
        byte[] data = new byte[1024];
        System.out.println("请输入数据信息:");
        int len = input.read(data);
        System.out.println("输入的数据为：" + new String(data,0,len));*/

       //标准的键盘输入的测试
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数据信息:");
        String str = buf.readLine();
        System.out.println("输入的数据为：" +str );
    }
}
