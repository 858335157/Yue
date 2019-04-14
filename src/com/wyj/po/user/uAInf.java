package com.wyj.po.user;

import java.io.Serializable;

/**
 * 用户敏感信息类,继承用户信息类 增加存储身份证号，注册时间，密码
 * 
 * @author 王宇杰
 * 
 */
public class UAInf extends UBInf implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idenId;
	private String rTime;
	private String pswd;

	/**
	 * 无参构造器
	 */
	public UAInf() {
	}

	/**
	 * 直接构造器
	 * 
	 * @param str
	 * @param flag
	 */
	public UAInf(String str, int flag) {
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
			} else if (key.equals("phone")) {
				phone = value;
			} else if (key.equals("mailbox")) {
				mailbox = value;
			} else if (key.equals("sex")) {
				sex = value;
			} else if (key.equals("charm")) {
				charm = Integer.valueOf(value);
			} else if (key.equals("idenId")) {
				idenId = value;
			} else if (key.equals("rTime")) {
				rTime = value;
			} else if (key.equals("pswd")) {
				pswd = value;
			} else {
				System.out.println("Error:UAInf");
			}
		}
	}

	/**
	 * 有参构造器
	 * 
	 * @param sId
	 * @param nick
	 * @param sign
	 * @param phone
	 * @param mailbox
	 * @param sex
	 * @param charm
	 * @param idenId
	 * @param rTime
	 * @param pswd
	 */
	public UAInf(String sId, String nick, String sign, String phone,
			String mailbox, String sex, int charm, String idenId, String rTime,
			String pswd) {
		super(sId, nick, sign, phone, mailbox, sex, charm);
		this.idenId = idenId;
		this.rTime = rTime;
		this.pswd = pswd;
	}

	/**
	 * 设置身份证号
	 * 
	 * @param idenId
	 */
	public void setIdenId(String idenId) {
		this.idenId = idenId;
	}

	/**
	 * 获取身份证号
	 * 
	 * @return idenId
	 */
	public String getIdenId() {
		return idenId;
	}

	/**
	 * 设置注册时间
	 * 
	 * @param rTime
	 */
	public void setRTime(String rTime) {
		this.rTime = rTime;
	}

	/**
	 * 获取注册时间
	 * 
	 * @return rTime
	 */
	public String getRTime() {
		return rTime;
	}

	/**
	 * 设置密码
	 * 
	 * @param pswd
	 */
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	/**
	 * 获取密码
	 * 
	 * @return pswd
	 */
	public String getPswd() {
		return pswd;
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

		bf.append("phone");
		bf.append(":");
		bf.append(phone);
		bf.append(';');

		bf.append("mailbox");
		bf.append(":");
		bf.append(mailbox);
		bf.append(';');

		bf.append("sex");
		bf.append(":");
		bf.append(sex);
		bf.append(';');

		bf.append("charm");
		bf.append(":");
		bf.append(charm);
		bf.append(';');

		bf.append("idenId");
		bf.append(":");
		bf.append(idenId);
		bf.append(';');

		bf.append("rTime");
		bf.append(":");
		bf.append(rTime);
		bf.append(';');

		bf.append("pswd");
		bf.append(":");
		bf.append(pswd);
		bf.append(';');

		bf.append('}');
		return bf.toString();
	}

}
