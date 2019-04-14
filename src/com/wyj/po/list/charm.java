package com.wyj.po.list;

import java.io.Serializable;

/**
 * 魅力榜排名类 存储存储用户id,学号排名列表，昵称列表，个性签名列表，魅力值列表
 * 
 * @author 王宇杰
 * 
 */
public class Charm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	private String[] list;
	private String[] nick;
	private String[] sign;
	private int[] charm;

	private static int Length;

	/**
	 * 无参构造器
	 */
	public Charm() {
	}

	/**
	 * 直接构造器
	 * 
	 * @param str
	 * @param flag
	 */
	public Charm(String str, int flag) {
		String[] K_V = str.substring(1, str.length()).split(";");
		for (int i = 0; i < K_V.length - 1; i++) {
			String key = K_V[i].substring(0, K_V[i].indexOf(':'));
			String value = K_V[i].substring(K_V[i].indexOf(':') + 1);
			if (key.equals("userId")) {
				userId = value;
			} else if (key.equals("list")) {
				String[] K_V_list = value.substring(1, str.length()).split(";");
				for (int j = 0; j < Length; j++) {
					list[j] = K_V_list[j].substring(2);
				}
			} else if (key.equals("nick")) {
				String[] K_V_nick = value.substring(1, str.length()).split(";");
				for (int j = 0; j < Length; j++) {
					nick[j] = K_V_nick[j].substring(2);
				}
			} else if (key.equals("sign")) {
				String[] K_V_sign = value.substring(1, str.length()).split(";");
				for (int j = 0; j < Length; j++) {
					sign[j] = K_V_sign[j].substring(2);
				}
			} else if (key.equals("charm")) {
				String[] K_V_charm = value.substring(1, str.length())
						.split(";");
				for (int j = 0; j < Length; j++) {
					charm[j] = Integer.valueOf(K_V_charm[j].substring(2));
				}
			} else {
				System.out.println("Error:Charm");
			}
		}
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param list
	 * @param nick
	 * @param sign
	 * @param charm
	 */
	public Charm(String userId, String[] list, String[] nick, String[] sign,
			int[] charm) {
		this.userId = userId;
		this.list = list;
		this.nick = nick;
		this.sign = sign;
		this.charm = charm;
	}

	/**
	 * 设置魅力榜人数
	 * 
	 * @param Length
	 */
	public void setLength(int Length) {
		Charm.Length = Length;
	}

	/**
	 * 获取魅力榜人数
	 * 
	 * @return Length
	 */
	public int getLength() {
		return Length;
	}

	/**
	 * 设置用户id
	 * 
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 获取用户id
	 * 
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 设置学号排名列表
	 * 
	 * @param list
	 */
	public void setList(String[] list) {
		this.list = list;
	}

	/**
	 * 获取学号排名列表
	 * 
	 * @return list
	 */
	public String[] getList() {
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
	 * 设置个性签名列表
	 * 
	 * @param sign
	 */
	public void setSign(String[] sign) {
		this.sign = sign;
	}

	/**
	 * 获取个性签名列表
	 * 
	 * @return sign
	 */
	public String[] getSign() {
		return sign;
	}

	/**
	 * 设置魅力值列表
	 * 
	 * @param charm
	 */
	public void setCharm(int[] charm) {
		this.charm = charm;
	}

	/**
	 * 获取魅力值列表
	 * 
	 * @return charm
	 */
	public int[] getCharm() {
		return charm;
	}

	/**
	 * 重写toString方法，方便序列化
	 */
	@Override
	public String toString() {

		StringBuffer bf = new StringBuffer();
		bf.append('{');

		bf.append("userId");
		bf.append(":");
		bf.append(userId);
		bf.append(';');

		bf.append("list");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(list[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append("nick");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(nick[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append("sign");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(sign[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append("charm");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(charm[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append('}');
		return bf.toString();
	}

}
