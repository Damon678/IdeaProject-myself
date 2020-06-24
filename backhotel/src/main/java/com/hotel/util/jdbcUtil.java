package com.hotel.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.jdbc.Driver;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//druid是java语言中最好用的数据库连接池
public class jdbcUtil {

    //static final修饰即静态只读，相当于常量 都要用大写字母
    private static final String URL = "jdbc:mysql://localhost:3306/hotel?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ww153916!";
    private static final DruidDataSource datasource = new DruidDataSource();
    static {
        datasource.setUrl(URL);
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUsername(USERNAME);
        datasource.setPassword(PASSWORD);

        datasource.setMaxActive(20);
        datasource.setMinIdle(8);
    }
    private static void close(PreparedStatement pstmt,Connection con){

        try {
            if(pstmt != null)
                pstmt.close();
            if (con != null)
                con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private static void close(ResultSet rs,PreparedStatement pstmt,Connection con){

        try {
            if (rs != null)
                rs.close();
            close(pstmt, con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static int executeUpdate(String sql,Object... params){

        int result=0;
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
             con=datasource.getConnection();
             pstmt=con.prepareStatement(sql);
             if(params != null){
                 for(int i =0 ;i < params.length ; i++){
                     pstmt.setObject(1+i,params[i]);
                 }
             }
             result = pstmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(pstmt,con);
        }
        return result;

    }


    //查询
    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params){
        List<T> list = new ArrayList<>();
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;

        try {
            con = datasource.getConnection();
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i =0 ;i < params.length ; i++){
                    pstmt.setObject(1+i,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()){
                T t =clz.newInstance();
              Field[] fields= clz.getDeclaredFields();
              for(Field field : fields){
                  try {
                      field.setAccessible(true);
                      field.set(t,rs.getObject(field.getName()));
                  }catch (Exception e){}

              }
              list.add(t);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(rs,pstmt,con);
        }
        return list;

    }

    //查询单条
    public static <T> T getById(String sql,Class<T> clz,Object... params){
        List<T> list = executeQuery(sql,clz,params);
        if (list != null && list.size() > 0){
            return list.get(0);
        }
        return null;

    }
}
