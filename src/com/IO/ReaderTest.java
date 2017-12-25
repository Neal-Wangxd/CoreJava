package com.IO;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest {
    public static void main(String[] args) throws Exception{
        File file = new File("C:"+File.separator+"Users"+File.separator+"wxd"+File.separator+"Desktop"+File.separator+"CoreJavaCode"+File.separator+"test.txt");
        //先判断文件是否存在，再进行读取
        if(file.exists()){
            //为Reader类对象实例化
            Reader reader = new FileReader(file);
            //进行数据读取
            char[] data = new char[1024];
            int len = reader.read(data);
            reader.close();
            System.out.println(new String(data,0,len));
        }
    }
}
