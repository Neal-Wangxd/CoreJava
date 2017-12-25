package com.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * Statement操作数据的测试
 *
 * @auther wxd
 * @create 2017/12/21
 * @desc Statement操作数据的测试
 * 当取得了数据库连接对象后，就可以进行数据操作了，可以使用最简单的Statement接口完成
 * 要取得Statement接口的实例化对象需要依靠Connection接口提供的方法完成：
 * 取得Statement接口对象：public Statement createStatement()throws SQLException;
 * 数据更新:public int executeUpdate(String sql)throws SQLException;返回更新的行数
 * 数据查询:public ResultSet executeQuery(String sql)throws SQLException;
 */
public class StatementTest {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://127.0.0.1:3306/springboot_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) throws Exception {
        Class.forName(DBDRIVER);
        Connection connection = DriverManager.getConnection(DBURL,USER,PASSWORD);
        Statement statement = connection.createStatement();
        //String insertSql = "insert into uum_user (username,age,sex,hight,salary) values ('Lili',23,'女',165,12000)";
        //String updateSql = "update uum_user set salary = 13000,age = 24 where username ='Lili'";
        //String delSql = "delete from uum_user where age > 30";
        //int len = statement.executeUpdate(delSql);
        //System.out.println("添加数据的条数为:"+len);
        String querySql = "select username,age,sex,birthday,salary,hight from uum_user";
        ResultSet resultSet = statement.executeQuery(querySql);
        while (resultSet.next()){
            String name = resultSet.getString("username");
            int age = resultSet.getInt("age");
            String sex = resultSet.getString("sex");
            Date birthday = resultSet.getDate("birthday");
            double salary = resultSet.getDouble(5);
            float hight = resultSet.getFloat(6);
            System.out.println("姓名："+name+",年龄："+age+",性别："+sex+",出生日期："+birthday+",薪资："+salary+",身高："+hight);
        }
        statement.close();
        connection.close();
    }
}
