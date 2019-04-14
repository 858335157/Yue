package com.wyj.po.list;

import java.io.Serializable;

/**
 * 聊天列表类 存储用户id,聊天列表(学号)，昵称列表，上一次消息列表，上一次消息时间列表
 * 
 * @author 王宇杰
 * 
 */
public class Chat implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	private String[] list;
	private String[] nick;
	private String[] Lmessage;
	private String[] LsTime;

	private static int Length;

	/**
	 * 无参构造器
	 */
	public Chat() {
	}

	/**
	 * 直接构造器
	 * 
	 * @param str
	 * @param flag
	 */
	public Chat(String str, int flag) {
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
			} else if (key.equals("Lmessage")) {
				String[] K_V_Lmessage = value.substring(1, str.length()).split(
						";");
				for (int j = 0; j < Length; j++) {
					Lmessage[j] = K_V_Lmessage[j].substring(2);
				}
			} else if (key.equals("LsTime")) {
				String[] K_V_LsTime = value.substring(1, str.length()).split(
						";");
				for (int j = 0; j < Length; j++) {
					LsTime[j] = K_V_LsTime[j].substring(2);
				}
			} else {
				System.out.println("Error:Chat");
			}
		}
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param list
	 * @param nick
	 * @param Lmessage
	 * @param LsTime
	 */
	public Chat(String userId, String[] list, String[] nick, String[] Lmessage,
			String[] LsTime) {
		this.userId = userId;
		this.list = list;
		this.nick = nick;
		this.Lmessage = Lmessage;
		this.LsTime = LsTime;
	}

	/**
	 * 设置聊天列表人数
	 * 
	 * @param Length
	 */
	public void setLength(int Length) {
		Chat.Length = Length;
	}

	/**
	 * 获取聊天列表人数
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
	 * 设置聊天列表(学号)
	 * 
	 * @param list
	 */
	public void setList(String[] list) {
		this.list = list;
	}

	/**
	 * 获取聊天列表(学号)
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
	 * 设置上一次消息列表
	 * 
	 * @param Lmessage
	 */
	public void setLmessage(String[] Lmessage) {
		this.Lmessage = Lmessage;
	}

	/**
	 * 获取上一次消息列表
	 * 
	 * @return Lmessage
	 */
	public String[] getLmessage() {
		return Lmessage;
	}

	/**
	 * 设置上一次消息时间列表
	 * 
	 * @param LsTime
	 */
	public void setLsTime(String[] LsTime) {
		this.LsTime = LsTime;
	}

	/**
	 * 获取上一次消息时间列表
	 * 
	 * @return LsTime
	 */
	public String[] getLsTime() {
		return LsTime;
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

		bf.append("Lmessage");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(Lmessage[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append("LsTime");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(LsTime[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append('}');
		return bf.toString();
	}

}
