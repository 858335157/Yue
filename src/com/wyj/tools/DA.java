package com.wyj.tools;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

/**
 * 服务器与安卓http请求数据传递格式，仿JSON
 * 
 * @author 王宇杰
 * 
 */
public class DA implements Serializable {

	private static final long serialVersionUID = 5L;

	private int no;
	private static int Length;
	private String[] Key;
	private String[] Value;

	/**
	 * 静态加载默认长度
	 */
	static {
		DA.init();
	}

	/**
	 * 无参构造器，初始化空DA
	 */
	public DA() {
		no = 0;
		Key = new String[Length];
		Value = new String[Length];
	}

	/**
	 * 有参构造器，用str 构造DA,用flag 来标识这是直接构造
	 * 
	 * @param str
	 */
	public DA(String str, int flag) {
		no = 0;
		Key = new String[Length];
		Value = new String[Length];
		build(str);
	}

	/**
	 * 放入键值对
	 * 
	 * @param key
	 * @param value
	 */
	public void put(String key, String value) {
		inspect();
		Key[no] = key;
		Value[no++] = value;
	}

	/**
	 * 通过key获取值
	 * 
	 * @param key
	 * @return value
	 */
	public String get(String key) {
		for (int i = 0; i < no; i++) {
			if (Key[i].equals(key)) {
				return Value[i];
			}
		}
		return "";
	}

	/**
	 * 检查是否溢出，如果是，就扩大容量
	 */
	private void inspect() {
		if (no >= Length) {
			Length += Key.length;
			String[] str = new String[Length];
			System.arraycopy(Key, 0, str, 0, Key.length);
			Key = str.clone();
			System.arraycopy(Value, 0, str, 0, Value.length);
			Value = str.clone();
		}
	}

	/**
	 * 重写toString方法，方便序列化
	 */
	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append('{');
		for (int i = 0; i < no; i++) {
			bf.append(Key[i]);
			bf.append(":");
			bf.append(Value[i]);
			bf.append(';');
		}
		bf.append('}');
		return bf.toString();
	}

	/**
	 * 构造DA
	 * @param str
	 */
	private void build(String str) {
		String[] K_V = str.substring(1, str.length()).split(";");
		for (int i = 0; i < K_V.length-1; i++) {
			String key = K_V[i].substring(0, K_V[i].indexOf(':'));
			String value = K_V[i].substring(K_V[i].indexOf(':') + 1);
			put(key, value);
		}
	}

	/**
	 * 获取conf.properties中设置的默认长度
	 */
	public static void init() {
		Properties properties = new Properties();
		String path = "conf.properties";
		InputStream is = DA.class.getClassLoader().getResourceAsStream(path);
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Length = Integer.valueOf(properties.getProperty("DALength"));
	}

}
