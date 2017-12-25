package com.IO;


import java.io.*;

/**
 * 系统输入测试类
 *
 * @auther wxd
 * @create 2017/12/14
 * @desc 系统输入测试类
 */
public class SystemInTest {
    public static void main(String[] args) throws  Exception{

        /*
         *保存的大数据长度有限制
         */
        /*InputStream in = System.in;
        byte[] data = new byte[3];//1024
        System.out.println("输入信息：");
        int len = in.read(data);
        System.out.println("输入的数据为：" + new String(data,0,len));*/



        /**
         * 推荐的使用方法（中文会出现乱码问题）
         */
        /*InputStream in = System.in;
        StringBuffer buf = new StringBuffer();
        System.out.println("输入信息：");
        int temp = 0;
        while ((temp = in.read()) != -1){
            if(temp == '\n'){
                break;
            }
            buf.append((char)temp);
        }
        System.out.println("输入的数据为：" + buf);*/

        /**
         * 标准的输入，推荐使用（不会有中文乱码问题）
         */
        /*BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入信息：");
        String str = buf.readLine();//以回车为换行
        System.out.println("输入的数据为：" + str);*/


        /**
         * 可以验证输入信息的输入
         */
        /*BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag){
            System.out.println("输入年龄：");
            String str = buf.readLine();
            if(str.matches("\\d{1,3}")){//正则验证
                System.out.println("您的年年龄是：" + str + "岁！");
                flag = false;
            }else{
                System.out.println("请输入正确的年龄！");
            }
        }*/

        /**
         *用缓冲区进行文件的读取
         */
        File file = new File("C:\\Users\\wxd\\Desktop\\CoreJavaCode\\test.txt");
        BufferedReader buf = new BufferedReader(new FileReader(file));
        String str = null;
        while ((str = buf.readLine()) != null){
            System.out.println(str);
        }
        buf.close();
    }
}
