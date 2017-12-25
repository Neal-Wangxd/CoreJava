package com.Socket;


import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * echo网络编程服务端
 *
 * @auther wxd
 * @create 2017/12/15
 * @desc echo网络编程服务端
 */
public class EchoServer {
    public static void main(String[] args) throws  Exception{
        ServerSocket server = new ServerSocket(9999);
        boolean flag = true;
        while (flag){
            Socket client = server.accept();
            new Thread(new EchoThread(client)).start();
        }
        server.close();
    }
}

class EchoThread implements Runnable{
    private Socket client;
    public  EchoThread(Socket client){
        this.client = client;
    }
    @Override
    public void run() {
        try{
            Scanner scanner = new Scanner(client.getInputStream());
            PrintStream out = new PrintStream(client.getOutputStream());
            boolean flag = true;
            while (flag){
                if (scanner.hasNext()){
                    String str = scanner.next().trim();
                    if(str.equalsIgnoreCase("byebye")){
                        out.println("程序结束了，下次再见！");
                        flag = false;
                    }else{
                        out.println("ECHO :"+str);
                    }
                }
            }
            scanner.close();
            out.close();
            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
