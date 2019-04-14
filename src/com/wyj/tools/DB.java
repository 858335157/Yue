package com.wyj.tools;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 封装数据库相关代码
 * 
 * @author 王宇杰
 * 
 */
public class DB {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	/**
	 * 静态加载保存好的数据库相关数据
	 */
	static {
		DB.init();
	}

	/**
	 * 建立连接
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 关闭连接
	 * 
	 * @param conn
	 * @param pstm
	 * @param rs
	 */
	public static void closeAll(Connection conn, Statement pstm, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (pstm != null) {
			try {
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 获取db.properties
	 */
	public static void init() {
		Properties properties = new Properties();
		String path = "db.properties";
		InputStream is = DB.class.getClassLoader().getResourceAsStream(path);
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
	}

}
