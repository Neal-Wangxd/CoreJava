package com.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamTest {
    public static void main(String[] args) throws Exception {
        File file = new File("C:"+File.separator+"Users"+File.separator+"wxd"+File.separator+"Desktop"+File.separator+"CoreJavaCode"+File.separator+"test.txt");
        //如果文件不存在就创建
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //使用OutputStream和其子类进行对象实例化，此时目录存在，文件不存在
        OutputStream out = new FileOutputStream(file,true);
        //要进行输出的文件内容
        String str = "Hello World! 你好，世界！\r\n";
        //将字符串变为字节数组
        byte[] data = str.getBytes();
        //将内容输出
        out.write(data);
        //最后关闭资源
        out.close();
    }
}
