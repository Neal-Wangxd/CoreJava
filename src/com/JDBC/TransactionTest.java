package com.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

/**
 * 事务处理测试类
 *
 * @auther wxd
 * @create 2017/12/22
 * @desc 事务处理测试类
 * 批处理：一次性向数据库中发出多条操作命令，一起执行。主要用的是Statement与PreparedStatement接口定义的方法
 * 增加批处理的语句：public void addBatch(String sql)throws SQLException;
 * 执行批处理：public int[] executeBatch() throws SQLException;
 * JDBC事务处理：
 * 事务提交：public void commit()throws SQLException;
 * 事务回滚：pubic void rollback()throws SQLException;
 * 设置事务提交的方式：public void setAutoCommit(boolean autoCommit)throws SQLException;
 */
public class TransactionTest {

    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://127.0.0.1:3306/springboot_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) throws Exception{
        Class.forName(DBDRIVER);
        Connection connection = DriverManager.getConnection(DBURL,USER,PASSWORD);
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);
        try {
            statement.addBatch("INSERT INTO UUM_USER(USERNAME,AGE,SEX,HIGHT,SALARY,BIRTHDAY) VALUES ('TONYA',25,'男',175,13000,'2017-12-22')");
            statement.addBatch("INSERT INTO UUM_USER(USERNAME,AGE,SEX,HIGHT,SALARY,BIRTHDAY) VALUES ('TONYB',25,'男',175,13000,'2017-12-22')");
            statement.addBatch("INSERT INTO UUM_USER(USERNAME,AGE,SEX,HIGHT,SALARY,BIRTHDAY) VALUES ('TONYC',25,'男',175,13000,'2017-12-22')");
            statement.addBatch("INSERT INTO UUM_USER(USERNAME,AGE,SEX,HIGHT,SALARY,BIRTHDAY) VALUES ('TONYD',25,'男',175,13000,'2017-12-22')");
            statement.addBatch("INSERT INTO UUM_USER(USERNAME,AGE,SEX,HIGHT,SALARY,BIRTHDAY) VALUES ('TONYE',25,'男',175,13000,'2017-12-22')");
            int[] result = statement.executeBatch();
            System.out.println(Arrays.toString(result));
            connection.commit();
        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }
        connection.close();
    }
}
