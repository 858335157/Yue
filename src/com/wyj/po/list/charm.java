package com.wyj.po.list;

import java.io.Serializable;



/**
 * 魅力榜排名类
 * 存储存储用户id,学号排名列表，昵称列表，个性签名列表，魅力值列表
 * @author 王宇杰
 *
 */
public class charm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int userId;
	private int[] list;
	private String[] nick;
	private String[] sign;
	private int[] charm;
	
	/**
	 * 无参构造器
	 */
	public charm() {
	}

	/**
	 * 有参构造器
	 * @param userId
	 * @param list
	 * @param nick
	 * @param sign
	 * @param charm
	 */
	public charm(int userId, int[] list, String[] nick, String[] sign, int[] charm) {
		this.userId = userId;
		this.list = list;
		this.nick = nick;
		this.sign = sign;
		this.charm = charm;
	}

	/**
	 * 设置用户id
	 * 
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 获取用户id
	 * 
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 设置学号排名列表
	 * @param list
	 */
	public void setList(int[] list) {
		this.list = list;
	}

	/**
	 * 获取学号排名列表
	 * @return list
	 */
	public int[] getList() {
		return list;
	}

	/**
	 * 设置昵称列表
	 * @param nick
	 */
	public void setNick(String[] nick) {
		this.nick = nick;
	}

	/**
	 * 获取昵称列表
	 * @return nick
	 */
	public String[] getNick() {
		return nick;
	}

	/**
	 * 设置个性签名列表
	 * @param sign
	 */
	public void setSign(String[] sign) {
		this.sign = sign;
	}
	
	/**
	 * 获取个性签名列表
	 * @return sign
	 */
	public String[] getSign() {
		return sign;
	}

	/**
	 * 设置魅力值列表
	 * @param charm
	 */
	public void setCharm(int[] charm) {
		this.charm = charm;
	}

	/**
	 * 获取魅力值列表
	 * @return charm
	 */
	public int[] getCharm() {
		return charm;
	}
	
}
