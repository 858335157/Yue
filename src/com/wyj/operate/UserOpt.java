package com.wyj.operate;


import com.wyj.po.list.*;
import com.wyj.po.user.*;

/**
 * 用户操作接口
 * 
 * @author 王宇杰
 * 
 */
public interface UserOpt {

	/**
	 * 登录
	 * 
	 * @param sId
	 * @param pswd
	 * @return 用户全部信息
	 */
	public UAInf Login(String sId, String pswd);

	/**
	 * 注册
	 * 
	 * @param uaInf
	 * @return 注册成功或失败标志
	 */
	public int Register(UAInf uaInf);

	/**
	 * 修改密码 
	 * 
	 * @param sId
	 * @param pswd
	 * @return 修改成功或失败标志
	 */
	public int ChangePSWD(String sId, String pswd);

	/**
	 * 发送验证码,当flag值为 1：通过手机短信验证 2：通过邮箱验证
	 * 
	 * @param address
	 * @return 6位验证码
	 */
	public String sendIdenCode(int flag, String address);

	/**
	 * 查询用户基础信息
	 * 
	 * @param sId
	 * @return UBInf
	 */
	public UBInf SearchBasicInf(String sId);

	/**
	 * 查询用户简要信息
	 * 
	 * @param sId
	 * @return ULInf
	 */
	public ULInf SearchLessInf(String sId);

	/**
	 * 查询魅力榜,flag=1 查询总榜；flag=2,查询好友榜
	 * 
	 * @param sId
	 * @param flag
	 * @return Charm
	 */
	public Charm SearchCharm(String sId, int flag);

	/**
	 * 查询聊天列表
	 * 
	 * @param sId
	 * @return Chat
	 */
	public Chat SearchChat(String sId);

	/**
	 * 查询动态的评论列表
	 * 
	 * @param sId
	 * @param trendsId
	 * @return Comment
	 */
	public Comment SearchComment(String sId, int trendsId);

	/**
	 * 查询好友列表
	 * 
	 * @param sId
	 * @return Friend
	 */
	public Friend SearchFriend(String sId);

	/**
	 * 查询房间列表
	 * 
	 * @param sId
	 * @param flag
	 * @return Room
	 */
	public Room SearchRoom(String sId, int flag);

	/**
	 * 查询动态列表
	 * 
	 * @param sId
	 * @return Trends
	 */
	public Trends SearchTrends(String sId);

	/**
	 * 修改个人信息
	 * 
	 * @param uaInf
	 * @return 修改成功或失败标志
	 */
	public int ChangeUaInf(UAInf uaInf);

}
