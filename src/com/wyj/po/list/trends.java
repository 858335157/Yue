package com.wyj.po.list;

import java.io.Serializable;

/**
 * 房间列表类 存储用户id,动态列表(动态id)，发布者id列表(学号)，昵称列表，发布时间列表，阅读人数列表，内容列表，分享数列表，评论数列表，点赞数列表
 * 
 * @author 王宇杰
 * 
 */
public class Trends implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private int[] list;
	private int[] owner;
	private String[] nick;
	private String[] pTime;
	private String[] number;
	private String[] content;
	private int[] shareNum;
	private int[] commentNum;
	private int[] agreeNum;

	/**
	 * 无参构造器
	 */
	public Trends() {
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param list
	 * @param owner
	 * @param nick
	 * @param pTime
	 * @param number
	 * @param content
	 * @param shareNum
	 * @param commentNum
	 * @param agreeNum
	 */
	public Trends(int userId, int[] list, int[] owner, String[] nick,
			String[] pTime, String[] number, String[] content, int[] shareNum,
			int[] commentNum, int[] agreeNum) {
		this.userId = userId;
		this.list = list;
		this.owner = owner;
		this.nick = nick;
		this.pTime = pTime;
		this.number = number;
		this.content = content;
		this.shareNum = shareNum;
		this.commentNum = commentNum;
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
	 * 设置房间列表(房间id)
	 * 
	 * @param list
	 */
	public void setList(int[] list) {
		this.list = list;
	}

	/**
	 * 获取房间列表(房间id)
	 * 
	 * @return list
	 */
	public int[] getList() {
		return list;
	}

	/**
	 * 设置发布者id列表(学号)
	 * 
	 * @param owner
	 */
	public void setOwner(int[] owner) {
		this.owner = owner;
	}

	/**
	 * 获取发布者id列表(学号)
	 * 
	 * @return owner
	 */
	public int[] getOwner() {
		return owner;
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
	 * 设置发布时间列表
	 * 
	 * @param pTime
	 */
	public void setpTime(String[] pTime) {
		this.pTime = pTime;
	}

	/**
	 * 获取发布时间列表
	 * 
	 * @return pTime
	 */
	public String[] getpTime() {
		return pTime;
	}

	/**
	 * 设置阅读人数列表
	 * 
	 * @param number
	 */
	public void setNumber(String[] number) {
		this.number = number;
	}

	/**
	 * 获取阅读人数列表
	 * 
	 * @return number
	 */
	public String[] getNumber() {
		return number;
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
	 * 设置分享数列表
	 * 
	 * @param shareNum
	 */
	public void setShareNum(int[] shareNum) {
		this.shareNum = shareNum;
	}

	/**
	 * 获取分享数列表
	 * 
	 * @return shareNum
	 */
	public int[] getShareNum() {
		return shareNum;
	}

	/**
	 * 设置评论数列表
	 * 
	 * @param commentNum
	 */
	public void setCommentNum(int[] commentNum) {
		this.commentNum = commentNum;
	}

	/**
	 * 获取评论数列表
	 * 
	 * @return commentNum
	 */
	public int[] getCommentNum() {
		return commentNum;
	}

	/**
	 * 设置点赞数列表
	 * 
	 * @param agreeNum
	 */
	public void setAgreeNum(int[] agreeNum) {
		this.agreeNum = agreeNum;
	}

	/**
	 * 获取点赞数列表
	 * 
	 * @return commentNum
	 */
	public int[] getAgreeNum() {
		return agreeNum;
	}
	
}
