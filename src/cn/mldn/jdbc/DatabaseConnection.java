package cn.mldn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 此类专门负责数据库的连接与关闭，只要一实例化此类对象则表示自动连接数据库
 * 每一个DatabaseConnection对象里面只包含一个Connection连接
 */
public class DatabaseConnection {

	/**
	 * @param args
	 */
	private static final String DBDRIVER="com.mysql.jdbc.Driver";
	private static final String DBURL="jdbc:mysql://localhost:3306/mydata";
	private static final String DBUSER="root";
	private static final String PASSWORD="root";
	private Connection conn;
	 public DatabaseConnection()  {
		 try {
			Class.forName(DBDRIVER);
			this.conn=DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	/*
	 * 返回的是一个Connection接口实例化对象
	 * @return conn;
	 */
	 public Connection getConnection() {
		 return this.conn;
		
	}
	 public void close() {
		 if (this.conn!=null) {
			try {
				this.conn.close(); 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
