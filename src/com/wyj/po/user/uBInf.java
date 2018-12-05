package com.wyj.po.user;

import java.io.Serializable;

/**
 * 用户信息基类uInf
 * 存储学号，昵称，个性签名。
 * @author 王宇杰
 *
 */
public class uBInf implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int sId;
	private String nick;
	private String sign;
	
	/**
	 * 无参构造器
	 */
	public uBInf() {
	}

	/**
	 * 有参构造器
	 * @param sId
	 * @param nick
	 * @param sign
	 */
	public uBInf(int sId, String nick, String sign) {
		this.sId = sId;
		this.nick = nick;
		this.sign = sign;
	}
	
	/**
	 * 设置学号
	 * @param sId
	 */
	public void setSId(int sId){
		this.sId = sId;
	}

	/**
	 * 获取学号
	 * @return sId
	 */
	public int getSId(){
		return sId;
	}

	/**
	 * 设置昵称
	 * @param nick
	 */
	public void setNick(String nick){
		this.nick = nick;
	}

	/**
	 * 获取昵称
	 * @return nick
	 */
	public String getNick(){
		return nick;
	}
	
	/**
	 * 设置个性签名
	 * @param sign
	 */
	public void setSign(String sign){
		this.sign = sign;
	}
	
	/**
	 * 获取个性签名
	 * @return sign
	 */
	public String getSign(){
		return sign;
	}
	
}


