package com.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 * jdbc数据库连接测试类
 *
 * @auther wxd
 * @create 2017/12/21
 * @desc jdbc数据库连接测试类
 * JDBC 连接数据库的操作流程都是固定的：
 * 1.加载数据库的驱动程序（向容器加载）
 * 2.进行数据库连接（通过DriverManager 类完成，Connection表示连接）
 * 3.进行数据的CRUD（Statement,PreparedStatement,ResultSet)
 * 4.关闭数据库操作以及连接（直接关闭连接就够了）
 *
 * 在JDBC里面，每一个数据库连接都要求使用一个Connection对象进行封装，
 * 所以只要有一个新的Connection对象，就表示要连接一次数据库
 */
public class JdbcConnectTest {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://127.0.0.1:3306/springboot_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) throws  Exception{
        //1.加载数据库驱动程序，此时不需要实例化，由容器自己负责管理
        Class.forName(DBDRIVER);
        //2.连接数据库
        Connection connection = DriverManager.getConnection(DBURL,USER,PASSWORD);
        //3.数据操作
        System.out.println(connection);
        //4.关闭数据库连接
        connection.close();
    }
}
