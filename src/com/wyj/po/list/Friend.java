package com.wyj.po.list;

import java.io.Serializable;

/**
 * 好友列表类 存储用户id, 好友列表，昵称列表，个性签名列表
 * 
 * @author 王宇杰
 * 
 */
public class Friend implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private int[] list;
	private String[] group;
	private String[] nick;
	private String[] sign;

	/**
	 * 无参构造器
	 */
	public Friend() {
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param list
	 * @param group
	 * @param nick
	 * @param sign
	 */
	public Friend(int userId, int[] list,String[] group, String[] nick, String[] sign) {
		this.userId = userId;
		this.list = list;
		this.group = group;
		this.nick = nick;
		this.sign = sign;
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
	 * 设置好友列表
	 * 
	 * @param list
	 */
	public void setList(int[] list) {
		this.list = list;
	}

	/**
	 * 获取好友列表
	 * 
	 * @return list
	 */
	public int[] getList() {
		return list;
	}
	
	/**
	 * 设置分组列表
	 * 
	 * @param group
	 */
	public void setGroup(String[] group) {
		this.group = group;
	}
	
	/**
	 * 获取分组列表
	 * 
	 * @return group
	 */
	public String[] getGroup() {
		return group;
	}

	/**
	 * 设置昵称列表
	 * 
	 * @param nick
	 */
	public void setNick(String[] nick) {
		this.nick = nick;
	}

	/**
	 * 获取昵称列表
	 * 
	 * @return nick
	 */
	public String[] getNick() {
		return nick;
	}

	/**
	 * 设置个性签名列表
	 * 
	 * @param sign
	 */
	public void setSign(String[] sign) {
		this.sign = sign;
	}

	/**
	 * 获取个性签名列表
	 * 
	 * @return sign
	 */
	public String[] getSign() {
		return sign;
	}

}
