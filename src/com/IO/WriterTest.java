package com.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) throws Exception{
        File file = new File("C:"+File.separator+"Users"+File.separator+"wxd"+File.separator+"Desktop"+File.separator+"CoreJavaCode"+File.separator+"test.txt");
        //如果文件不存在就创建
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //实例化Writer类对象
        Writer writer = new FileWriter(file);
        //要输出的内容
        String str = "这是一个测试输出字符流的测试！";
        //输出字符串数据
        writer.write(str);
        //关闭流程
        writer.close();
    }
}
