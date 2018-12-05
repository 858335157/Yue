package com.wyj.po.user;

import java.io.Serializable;

/**
 * 用户信息类，继承用户信息基类
 * 增加存储电话号码，性别，魅力值
 * @author 王宇杰
 *
 */
class uFInf extends uBInf implements Serializable{

	private static final long serialVersionUID = 1L;

	private String phone;
	private String sex;
	private int charm;

	/**
	 * 无参构造器
	 */
	public uFInf() {
	}

	/**
	 * 有参构造器
	 * @param sId
	 * @param nick
	 * @param sign
	 * @param phone
	 * @param sex
	 * @param charm
	 */
	public uFInf(int sId, String nick, String sign, String phone, String sex,
			int charm) {
		super(sId, nick, sign);
		this.phone = phone;
		this.sex = sex;
		this.charm = charm;
	}

	/**
	 * 设置电话号码
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取电话号码
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置性别
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 获取性别
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 设置魅力值
	 * @param charm
	 */
	public void setCharm(int charm) {
		this.charm = charm;
	}

	/**
	 * 获取魅力值
	 * @return charm
	 */
	public int getCharm() {
		return charm;
	}
}