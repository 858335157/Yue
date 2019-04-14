package com.wyj.po.user;

import java.io.Serializable;

/**
 * 用户信息类，继承用户信息基类 增加存储电话号码，邮箱， 性别，魅力值
 * 
 * @author 王宇杰
 * 
 */
public class UBInf extends ULInf implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String phone;
	protected String mailbox;
	protected String sex;
	protected int charm;

	/**
	 * 无参构造器
	 */
	public UBInf() {
	}

	/**
	 * 直接构造器
	 * 
	 * @param str
	 * @param flag
	 */
	public UBInf(String str, int flag) {
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
			} else {
				System.out.println("Error:UBInf");
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
	 */
	public UBInf(String sId, String nick, String sign, String phone,
			String mailbox, String sex, int charm) {
		super(sId, nick, sign);
		this.phone = phone;
		this.mailbox = mailbox;
		this.sex = sex;
		this.charm = charm;
	}

	/**
	 * 设置电话号码
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取电话号码
	 * 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置邮箱
	 * 
	 * @param mailbox
	 */
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	/**
	 * 获取邮箱
	 * 
	 * @return mailbox
	 */
	public String getMailbox() {
		return mailbox;
	}

	/**
	 * 设置性别
	 * 
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 获取性别
	 * 
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 设置魅力值
	 * 
	 * @param charm
	 */
	public void setCharm(int charm) {
		this.charm = charm;
	}

	/**
	 * 获取魅力值
	 * 
	 * @return charm
	 */
	public int getCharm() {
		return charm;
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

		bf.append('}');
		return bf.toString();
	}

}