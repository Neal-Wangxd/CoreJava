package com.IO;


import java.io.*;

/**
 * 文件copy测试类
 * @auther wxd
 * @create 2017/12/11
 * @desc 文件copy测试类
 */
public class FileCopyTest {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        copyDomeNew("C:\\Users\\wxd\\Desktop\\CoreJavaCode\\fileCopy\\source\\cat.jpg","C:\\Users\\wxd\\Desktop\\CoreJavaCode\\fileCopy\\target\\cat.jpg");
        long end = System.currentTimeMillis();
        System.out.println("所用时间："+(end - start));
    }

    /**
     * 文件copy的具体实现（不推荐的方法）
     * @param source
     * @param target
     * @throws Exception
     */
    public static void copyDomeOld(String source,String target) throws Exception{
        if(source == null || target == null){//初始化参数必须为两个，一个源一个目标
            System.out.println("参数错误！");
            System.exit(1);//程序退出执行
        }else{
            File sourceFile  = new File(source);
            if(!sourceFile.exists()){//源文件不存在
                System.out.println("源文件不存在，请确认！");
                System.exit(1);
            }
            File targetFile = new File(target);
            if(!targetFile.getParentFile().exists()){//目标路径不存在
                targetFile.getParentFile().mkdirs();//创建目录
            }
            InputStream input = new FileInputStream(sourceFile);
            OutputStream output = new FileOutputStream(targetFile);
            int temp = 0;//保存每次读取的内容
            while ((temp = input.read()) != -1){//每次读取单个字节
                output.write(temp);//输出单个字节
            }
            input.close();
            output.close();
        }
    }


    /**
     * 文件copy的具体实现（推荐使用的方法）
     * @param source
     * @param target
     * @throws Exception
     */
    public static void copyDomeNew(String source,String target) throws Exception{
        if(source == null || target == null){//初始化参数必须为两个，一个源一个目标
            System.out.println("参数错误！");
            System.exit(1);//程序退出执行
        }else{
            File sourceFile  = new File(source);
            if(!sourceFile.exists()){//源文件不存在
                System.out.println("源文件不存在，请确认！");
                System.exit(1);
            }
            File targetFile = new File(target);
            if(!targetFile.getParentFile().exists()){//目标路径不存在
                targetFile.getParentFile().mkdirs();//创建目录
            }
            InputStream input = new FileInputStream(sourceFile);
            OutputStream output = new FileOutputStream(targetFile);
            int temp = 0;//保存每次读取的个数
            byte[] bytes = new byte[1024];//一次读取1024个字节
            //将每次读取进来的数据保存到字节数组里，并且返回读取的个数
            while ((temp = input.read(bytes)) != -1){
                output.write(bytes,0,temp);//输出数组
            }
            input.close();
            output.close();
        }
    }
}
