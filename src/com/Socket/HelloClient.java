package com.Socket;


import java.net.Socket;
import java.util.Scanner;

/**
 * socket客户端
 *
 * @auther wxd
 * @create 2017/12/15
 * @desc socket客户端
 */
public class HelloClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("127.0.0.1",9999);
        //取得客户端的输入数据流的对象，表示接收服务端的输出信息
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        if(scanner.hasNext()){
            System.out.println("【回应数据】"+scanner.next());
        }
        scanner.close();
        client.close();
    }
}
