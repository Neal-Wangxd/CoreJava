package com.IO;


import java.util.Scanner;

/**
 * 扫描流的测试
 *
 * @auther wxd
 * @create 2017/12/14
 * @desc 扫描流的测试
 */
public class ScannerTest {
    public static void main(String[] args) {
        /**
         * 键盘接收输入数据（不能有空格）
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("输入信息：");
        if(scanner.hasNext()){//先判断是否有数据输入
            System.out.println("输入的信息为：" + scanner.next());
        }*/
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("输入成绩：");
        if(scanner.hasNextDouble()){//判断数据类型
            System.out.println("输入的成绩为：" + scanner.nextDouble());
        }else {
            System.out.println("输入的成绩不符合！");
        }
        scanner.close();
    }
}
