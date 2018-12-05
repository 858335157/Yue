package com.wyj.po.user;

import java.io.Serializable;

/**
 * 用户敏感信息类,继承用户信息类
 * 增加存储身份证号，注册时间，密码
 * @author 王宇杰
 *
 */
public class uAInf extends uFInf implements Serializable{

	private static final long serialVersionUID = 1L;

	private String idenId;
	private String rTime;
	private String pswd;

	/**
	 * 无参构造器
	 */
	public uAInf() {
	}

	/**
	 * 有参构造器
	 * @param sId
	 * @param nick
	 * @param sign
	 * @param phone
	 * @param sex
	 * @param charm
	 * @param idenId
	 * @param rTime
	 * @param pswd
	 */
	public uAInf(int sId, String nick, String sign, String phone, String sex,
			int charm, String idenId, String rTime, String pswd) {
		super(sId, nick, sign, phone, sex, charm);
		this.idenId = idenId;
		this.rTime = rTime;
		this.pswd = pswd;
	}

	/**
	 * 设置身份证号
	 * @param idenId
	 */
	public void setIdenId(String idenId) {
		this.idenId = idenId;
	}

	/**
	 * 获取身份证号
	 * @return idenId
	 */
	public String getIdenId() {
		return idenId;
	}

	/**
	 * 设置注册时间
	 * @param rTime
	 */
	public void setRTime(String rTime) {
		this.rTime = rTime;
	}

	/**
	 * 获取注册时间
	 * @return rTime
	 */
	public String getRTime() {
		return rTime;
	}

	/**
	 * 设置密码
	 * @param pswd
	 */
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	/**
	 * 获取密码
	 * @return pswd
	 */
	public String getPswd() {
		return pswd;
	}

}
