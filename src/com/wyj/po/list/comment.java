package com.wyj.po.list;

import java.io.Serializable;

/**
 * 评论列表类 存储用户id,动态id，评论列表，昵称列表，内容列表，被点赞数
 * 
 * @author 王宇杰
 * 
 */
public class comment implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private int trendsId;
	private int[] list;
	private String[] nick;
	private String[] content;
	private int[] agreeNum;

	/**
	 * 无参构造器
	 */
	public comment() {
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param trendsId
	 * @param list
	 * @param nick
	 * @param content
	 * @param agreeNum
	 */
	public comment(int userId, int trendsId, int[] list, String[] nick,
			String[] content, int[] agreeNum) {
		this.userId = userId;
		this.trendsId = trendsId;
		this.list = list;
		this.nick = nick;
		this.content = content;
		this.agreeNum = agreeNum;
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
	 * 设置动态id
	 * 
	 * @param trendsId
	 */
	public void setTrendsId(int trendsId) {
		this.trendsId = trendsId;
	}

	/**
	 * 获取动态id
	 * 
	 * @return trendsId
	 */
	public int getTrendsId() {
		return trendsId;
	}

	/**
	 * 设置评论列表
	 * 
	 * @param list
	 */
	public void setList(int[] list) {
		this.list = list;
	}

	/**
	 * 获取评论列表
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
	 * 设置内容列表
	 * 
	 * @param content
	 */
	public void setContent(String[] content) {
		this.content = content;
	}

	/**
	 * 获取内容列表
	 * 
	 * @return content
	 */
	public String[] getContent() {
		return content;
	}

	/**
	 * 设置被点赞数
	 * 
	 * @param agreeNum
	 */
	public void setAgreeNum(int[] agreeNum) {
		this.agreeNum = agreeNum;
	}

	/**
	 * 获取被点赞数
	 * 
	 * @return agreeNum
	 */
	public int[] getAgreeNum() {
		return agreeNum;
	}

}
