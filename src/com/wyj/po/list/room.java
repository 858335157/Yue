package com.wyj.po.list;

import java.io.Serializable;

/**
 * 房间列表类
 * 存储用户id,房间列表(房间id)，房间类型列表，房间名列表，创建者列表，地点列表，时间列表， 当前人数列表，最大人数列表
 * @author 王宇杰
 * 
 */
public class Room implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private int[] list;
	private String[] type;
	private String[] name;
	private int[] owner;
	private String[] place;
	private String[] time;
	private int[] number;
	private int[] maxNumber;

	/**
	 * 无参构造器
	 */
	public Room() {
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param list
	 * @param type
	 * @param name
	 * @param owner
	 * @param place
	 * @param time
	 * @param number
	 * @param maxNumber
	 */
	public Room(int userId, int[] list, String[] type, String[] name,
			int[] owner, String[] place, String[] time, int[] number, int[] maxNumber) {
		this.userId = userId;
		this.list = list;
		this.type = type;
		this.name = name;
		this.owner = owner;
		this.place = place;
		this.time = time;
		this.owner = number;
		this.maxNumber = maxNumber;
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
	 * 设置房间类型列表
	 * 
	 * @param type
	 */
	public void setType(String[] type) {
		this.type = type;
	}

	/**
	 * 获取房间类型列表
	 * 
	 * @return type
	 */
	public String[] getType() {
		return type;
	}

	/**
	 * 设置房间名列表
	 * 
	 * @param name
	 */
	public void setName(String[] name) {
		this.name = name;
	}

	/**
	 * 获取房间名列表
	 * 
	 * @return name
	 */
	public String[] getName() {
		return name;
	}

	/**
	 * 设置创建者列表
	 * 
	 * @param owner
	 */
	public void setOwner(int[] owner) {
		this.owner = owner;
	}

	/**
	 * 获取创建者列表
	 * 
	 * @return owner
	 */
	public int[] getOwner() {
		return owner;
	}

	/**
	 * 设置地点
	 * 
	 * @param place
	 */
	public void setPlace(String[] place) {
		this.place = place;
	}

	/**
	 * 获取地点
	 * 
	 * @return place
	 */
	public String[] getPlace() {
		return place;
	}

	/**
	 * 设置时间
	 * 
	 * @param time
	 */
	public void setTime(String[] time) {
		this.time = time;
	}

	/**
	 * 获取时间
	 * 
	 * @return time
	 */
	public String[] getTime() {
		return time;
	}

	/**
	 * 设置当前人数列表
	 * 
	 * @param number
	 */
	public void setNumber(int[] number) {
		this.number = number;
	}

	/**
	 * 获取当前人数列表
	 * 
	 * @return number
	 */
	public int[] getNumber() {
		return number;
	}

	/**
	 * 设置最大人数列表
	 * 
	 * @param maxNumber
	 */
	public void setMaxNumber(int[] maxNumber) {
		this.maxNumber = maxNumber;
	}

	/**
	 * 获取最大人数列表
	 * 
	 * @return maxNumber
	 */
	public int[] getMaxNumber() {
		return maxNumber;
	}
	
}
