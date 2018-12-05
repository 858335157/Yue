package com.wyj.po.list;

import java.io.Serializable;

/**
 * 聊天列表类 存储用户id,聊天列表(学号)，昵称列表，上一次消息列表，上一次消息时间列表
 * 
 * @author 王宇杰
 * 
 */
public class chat implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private int[] list;
	private String[] nick;
	private String[] Lmessage;
	private String[] LsTime;

	/**
	 * 无参构造器
	 */
	public chat() {
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param list
	 * @param nick
	 * @param Lmessage
	 * @param LsTime
	 */
	public chat(int userId, int[] list, String[] nick, String[] Lmessage,
			String[] LsTime) {
		this.userId = userId;
		this.list = list;
		this.nick = nick;
		this.Lmessage = Lmessage;
		this.LsTime = LsTime;
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
	 * 设置聊天列表(学号)
	 * 
	 * @param list
	 */
	public void setList(int[] list) {
		this.list = list;
	}

	/**
	 * 获取聊天列表(学号)
	 * 
	 * @return list
	 */
	public int[] getList() {
		return list;
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
	 * 设置上一次消息列表
	 * 
	 * @param sign
	 */
	public void setLmessage(String[] Lmessage) {
		this.Lmessage = Lmessage;
	}

	/**
	 * 获取上一次消息列表
	 * 
	 * @return sign
	 */
	public String[] getLmessage() {
		return Lmessage;
	}

	/**
	 * 设置上一次消息时间列表
	 * 
	 * @param charm
	 */
	public void setLsTime(String[] LsTime) {
		this.LsTime = LsTime;
	}

	/**
	 * 获取上一次消息时间列表
	 * 
	 * @return charm
	 */
	public String[] getLsTime() {
		return LsTime;
	}

}
