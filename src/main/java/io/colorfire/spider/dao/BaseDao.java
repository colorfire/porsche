package io.colorfire.spider.dao;

import java.sql.*;

/**
 * @author colorfire on 17/3/27
 */
public abstract class BaseDao<T> {

  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://127.0.0.1/test?characterEncoding=utf-8";

  //  Database credentials
  static final String USER = "root";
  static final String PASS = "root";

  static Connection conn = null;
  static Statement stmt = null;

  static {
    try {
      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
    } catch (SQLException se) {
      se.printStackTrace();
    }
  }

  public abstract void add(T obj);

  public abstract Object get(int id);

  protected void close(ResultSet rs) {
    try {
      if (rs != null)
        rs.close();
      conn.close();
      stmt.close();
    } catch (SQLException se) {
      se.printStackTrace();
    } finally {
      try {
        if (stmt != null)
          stmt.close();
      } catch (SQLException se2) {
      }

      try {
        if (conn != null)
          conn.close();
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }

  }
}
