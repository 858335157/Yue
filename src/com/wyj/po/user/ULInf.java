package com.wyj.po.user;

import java.io.Serializable;

/**
 * 用户信息基类uInf 存储学号，昵称，个性签名。
 * 
 * @author 王宇杰
 * 
 */
public class ULInf implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String sId;
	protected String nick;
	protected String sign;

	/**
	 * 无参构造器
	 */
	public ULInf() {
	}

	/**
	 * 直接构造器
	 * 
	 * @param str
	 * @param flag
	 */
	public ULInf(String str, int flag) {
		String[] K_V = str.substring(1, str.length()).split(";");
		for (int i = 0; i < K_V.length - 1; i++) {
			String key = K_V[i].substring(0, K_V[i].indexOf(':'));
			String value = K_V[i].substring(K_V[i].indexOf(':') + 1);
			if (key.equals("sId")) {
				sId = value;
			} else if (key.equals("nick")) {
				nick = value;
			} else if (key.equals("sign")) {
				sign = value;
			} else {
				System.out.println("Error:ULInf");
			}
		}
	}

	/**
	 * 有参构造器
	 * 
	 * @param sId
	 * @param nick
	 * @param sign
	 */
	public ULInf(String sId, String nick, String sign) {
		this.sId = sId;
		this.nick = nick;
		this.sign = sign;
	}

	/**
	 * 设置学号
	 * 
	 * @param sId
	 */
	public void setSId(String sId) {
		this.sId = sId;
	}

	/**
	 * 获取学号
	 * 
	 * @return sId
	 */
	public String getSId() {
		return sId;
	}

	/**
	 * 设置昵称
	 * 
	 * @param nick
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * 获取昵称
	 * 
	 * @return nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * 设置个性签名
	 * 
	 * @param sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * 获取个性签名
	 * 
	 * @return sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * 重写toString方法，方便序列化
	 */
	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append('{');

		bf.append("sId");
		bf.append(":");
		bf.append(sId);
		bf.append(';');

		bf.append("nick");
		bf.append(":");
		bf.append(nick);
		bf.append(';');

		bf.append("sign");
		bf.append(":");
		bf.append(sign);
		bf.append(';');

		bf.append('}');
		return bf.toString();
	}

}
