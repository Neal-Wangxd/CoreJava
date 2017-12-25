package com.JDBC;


import java.sql.*;
import java.util.Date;

/**
 * PreparedStatement测试类
 *
 * @auther wxd
 * @create 2017/12/21
 * @desc PreparedStatement测试类
 * 由于Statement接口有严重的缺陷（在参数有单引号的情况下回发生sql错误），
 * 由于Statement的执行模式不适合处理一些敏感字符
 * 所以在实际开发中不会被使用到
 */
public class PreparedStatementTest {

    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://127.0.0.1:3306/springboot_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) throws Exception{

        String name = "Mr'SMITH";
        int age = 28;
        String sex = "男";
        double hight = 185;
        float salary = 18000;
        Date birthday = new Date();

        Class.forName(DBDRIVER);
        Connection connection = DriverManager.getConnection(DBURL,USER,PASSWORD);
        //添加数据
        /*String sql = "insert into uum_user (username,age,sex,hight,salary,birthday) values (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,age);
        preparedStatement.setString(3,sex);
        preparedStatement.setDouble(4,hight);
        preparedStatement.setFloat(5,salary);
        preparedStatement.setDate(6,new java.sql.Date(birthday.getTime()));
        int len  = preparedStatement.executeUpdate();
        System.out.println("影响的数据行数："+len);*/
        //查询数据
        //String querySql  = "SELECT username,age,sex,hight,salary,birthday FROM UUM_USER";

        //根据条件查询
        //int keyAge = 24;
        //String sql = "SELECT username,age,sex,hight,salary,birthday FROM UUM_USER WHERE age >= ?";
        //preparedStatement.setInt(1,keyAge);

        //分页查询
        /*int start = 0;
        int end = 5;
        String sql = "SELECT username,age,sex,hight,salary,birthday FROM UUM_USER LIMIT ?,?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,start);
        preparedStatement.setInt(2,end);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String rsname = resultSet.getString("username");
            int rsage = resultSet.getInt("age");
            String rssex = resultSet.getString("sex");
            Date rsbirthday = resultSet.getDate("birthday");
            double rssalary = resultSet.getDouble("salary");
            float rshight = resultSet.getFloat("hight");
            System.out.println("姓名："+rsname+",年龄："+rsage+",性别："+rssex+",出生日期："+rsbirthday+",薪资："+rssalary+",身高："+rshight);
        }*/

        //查询总数
        String sql = "SELECT count(username) FROM UUM_USER";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println("总数据为："+resultSet.getInt(1));
        }
        preparedStatement.close();
        connection.close();
    }
}
