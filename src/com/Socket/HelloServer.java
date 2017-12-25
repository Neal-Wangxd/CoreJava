package com.Socket;


import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket服务端
 *
 * @auther wxd
 * @create 2017/12/15
 * @desc socket服务端
 */
public class HelloServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("等待客户端连接.....");
        Socket socket = server.accept();//等待客户端连接
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("Hello World !");
        out.close();
        socket.close();
        server.close();
    }
}
