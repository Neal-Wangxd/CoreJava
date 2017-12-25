package com.Socket;


import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * echo网络编程
 *
 * @auther wxd
 * @create 2017/12/15
 * @desc echo网络编程
 */
public class EchoClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("127.0.0.1",9999);
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(client.getInputStream());
        PrintStream printStream = new PrintStream(client.getOutputStream());
        input.useDelimiter("\n");
        scanner.useDelimiter("\n");
        boolean flag = true;
        while (flag){
            System.out.println("输入要发送的信息！");
            if(input.hasNext()){
                String str = input.next().trim();
                printStream.println(str);
                if(str.equalsIgnoreCase("byebye")){
                    flag = false;
                }
                if(scanner.hasNext()){
                    System.out.println(scanner.next());
                }
            }
        }
        input.close();
        scanner.close();
        printStream.close();
        client.close();
    }
}
