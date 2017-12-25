package com.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InPutStreamTest {
    public static void main(String[] args) throws Exception {
        File file = new File("C:"+File.separator+"Users"+File.separator+"wxd"+File.separator+"Desktop"+File.separator+"CoreJavaCode"+File.separator+"test.txt");
        //先判断文件是否存在，再进行读取
        if(file.exists()){
            //使用InputStrean进行读取
            InputStream in = new FileInputStream(file);
            //进行数据读取
            byte[] data = new byte[1024];
            int foot = 0;//表示字节数组的操作下标
            int temp = 0;//表示读取的当前字节数据下标
            while ((temp = in.read()) != -1){
                data[foot ++] = (byte) temp;
            }
            //关闭输入流
            in.close();
            System.out.println(new String(data,0,foot));
        }
    }
}
