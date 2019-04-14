package com.wyj.po.list;

import java.io.Serializable;

/**
 * 评论列表类 存储用户id,动态id，评论列表，昵称列表，内容列表，被点赞数
 * 
 * @author 王宇杰
 * 
 */
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	private String trendsId;
	private String[] list;
	private String[] nick;
	private String[] content;
	private int[] agreeNum;

	private static int Length;

	/**
	 * 无参构造器
	 */
	public Comment() {
	}

	/**
	 * 直接构造器
	 * 
	 * @param str
	 * @param flag
	 */
	public Comment(String str, int flag) {
		String[] K_V = str.substring(1, str.length()).split(";");
		for (int i = 0; i < K_V.length - 1; i++) {
			String key = K_V[i].substring(0, K_V[i].indexOf(':'));
			String value = K_V[i].substring(K_V[i].indexOf(':') + 1);
			if (key.equals("userId")) {
				userId = value;
			} else if (key.equals("trendsId")) {
				trendsId = value;
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
			} else if (key.equals("content")) {
				String[] K_V_Lmessage = value.substring(1, str.length()).split(
						";");
				for (int j = 0; j < Length; j++) {
					content[j] = K_V_Lmessage[j].substring(2);
				}
			} else if (key.equals("agreeNum")) {
				String[] K_V_LsTime = value.substring(1, str.length()).split(
						";");
				for (int j = 0; j < Length; j++) {
					agreeNum[j] = Integer.valueOf(K_V_LsTime[j].substring(2));
				}
			} else {
				System.out.println("Error:Comment");
			}
		}
	}

	/**
	 * 有参构造器
	 * 
	 * @param userId
	 * @param trendsId
	 * @param list
	 * @param nick
	 * @param content
	 * @param agreeNum
	 */
	public Comment(String userId, String trendsId, String[] list,
			String[] nick, String[] content, int[] agreeNum) {
		this.userId = userId;
		this.trendsId = trendsId;
		this.list = list;
		this.nick = nick;
		this.content = content;
		this.agreeNum = agreeNum;
	}

	/**
	 * 设置评论列表人数
	 * 
	 * @param Length
	 */
	public void setLength(int Length) {
		Comment.Length = Length;
	}

	/**
	 * 获取评论列表人数
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
	 * 设置动态id
	 * 
	 * @param trendsId
	 */
	public void setTrendsId(String trendsId) {
		this.trendsId = trendsId;
	}

	/**
	 * 获取动态id
	 * 
	 * @return trendsId
	 */
	public String getTrendsId() {
		return trendsId;
	}

	/**
	 * 设置评论列表
	 * 
	 * @param list
	 */
	public void setList(String[] list) {
		this.list = list;
	}

	/**
	 * 获取评论列表
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
	 * 设置被点赞数
	 * 
	 * @param agreeNum
	 */
	public void setAgreeNum(int[] agreeNum) {
		this.agreeNum = agreeNum;
	}

	/**
	 * 获取被点赞数
	 * 
	 * @return agreeNum
	 */
	public int[] getAgreeNum() {
		return agreeNum;
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

		bf.append("trendsId");
		bf.append(":");
		bf.append(trendsId);
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

		bf.append("content");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(content[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append("agreeNum");
		bf.append(":");
		bf.append('{');
		for (int i = 0; i < Length; i++) {
			bf.append(i);
			bf.append(":");
			bf.append(agreeNum[i]);
			bf.append(';');
		}
		bf.append('}');
		bf.append(';');

		bf.append('}');
		return bf.toString();
	}

}
