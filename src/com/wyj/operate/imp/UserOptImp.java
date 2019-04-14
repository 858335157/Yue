package com.wyj.operate.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.wyj.operate.UserOpt;
import com.wyj.po.list.*;
import com.wyj.po.user.*;
import com.wyj.tools.DB;

public class UserOptImp implements UserOpt {

	@Override
	public UAInf Login(String sId, String pswd) {
		UAInf user = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			pstm = conn
					.prepareStatement(
							"select " +
							"* " +
							"from " +
							"user " +
							"where " +
							"sId = ? and pswd = ?");
			pstm.setObject(1, sId);
			pstm.setObject(2, pswd);
			rs = pstm.executeQuery();
			if (rs.next()) {
				user = new UAInf();
				user.setSId(rs.getString(2));
				user.setPswd(rs.getString(3));
				user.setIdenId(rs.getString(4));
				user.setNick(rs.getString(5));
				user.setPhone(rs.getString(6));
				user.setMailbox(rs.getString(7));
				user.setSex(rs.getString(8));
				user.setSign(rs.getString(9));
				user.setCharm(rs.getInt(10));
				user.setRTime(new SimpleDateFormat("yyyy-MM-dd").format(rs
						.getDate(11)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeAll(conn, pstm, rs);
		}
		return user;
	}

	@Override
	public int Register(UAInf uaInf) {
		Connection conn = null;
		PreparedStatement pstm = null;
		int sum = 0;
		try {
			conn = DB.getConnection();
			pstm = conn
					.prepareStatement(
							"insert into " +
							"user(sId,pswd,idenId,nick,phone,mailbox,sex,sign,charm,rtime) " +
							"value(?,?,?,?,?,?,?,?,?,now())");
			pstm.setObject(1, uaInf.getSId());
			pstm.setObject(2, uaInf.getPswd());
			pstm.setObject(3, uaInf.getIdenId());
			pstm.setObject(4, uaInf.getNick());
			pstm.setObject(5, uaInf.getPhone());
			pstm.setObject(6, uaInf.getMailbox());
			pstm.setObject(7, uaInf.getSex());
			pstm.setObject(8, uaInf.getSign());
			pstm.setObject(9, uaInf.getCharm());
			sum = pstm.executeUpdate();
			return sum - 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		} finally {
			DB.closeAll(conn, pstm, null);
		}
	}

	@Override
	public int ChangePSWD(String sId, String pswd) {
		Connection conn = null;
		PreparedStatement pstm = null;
		int sum = 0;
		try {
			conn = DB.getConnection();
			pstm = conn
					.prepareStatement(
							"update " +
							"user " +
							"set " +
							"pswd=? " +
							"where sId = ?");
			pstm.setObject(1, pswd);
			pstm.setObject(2, sId);
			sum = pstm.executeUpdate();
			return sum - 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		} finally {
			DB.closeAll(conn, pstm, null);
		}
	}

	@Override
	public String sendIdenCode(int flag, String address) {
		// TODO Auto-generated method stub
		return "051564";
	}

	@Override
	public UBInf SearchBasicInf(String sId) {
		UBInf user = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			pstm = conn.prepareStatement(
					"select " +
					"* " +
					"from " +
					"user " +
					"where " +
					"sId = ?");
			pstm.setObject(1, sId);
			rs = pstm.executeQuery();
			if (rs.next()) {
				user = new UAInf();
				user.setSId(rs.getString(2));
				user.setNick(rs.getString(5));
				user.setPhone(rs.getString(6));
				user.setMailbox(rs.getString(7));
				user.setSex(rs.getString(8));
				user.setSign(rs.getString(9));
				user.setCharm(rs.getInt(10));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeAll(conn, pstm, rs);
		}
		return user;
	}

	@Override
	public ULInf SearchLessInf(String sId) {
		ULInf user = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			pstm = conn.prepareStatement(
					"select " +
					"* " +
					"from " +
					"user " +
					"where " +
					"sId = ?");
			pstm.setObject(1, sId);
			rs = pstm.executeQuery();
			if (rs.next()) {
				user = new UAInf();
				user.setSId(rs.getString(2));
				user.setNick(rs.getString(5));
				user.setSign(rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeAll(conn, pstm, rs);
		}
		return user;
	}

	@Override
	public Charm SearchCharm(String sId, int flag) {
		Charm Charm = new Charm();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			if (flag == 1) {
				pstm = conn
						.prepareStatement(
								"select " +
								"sId,nick,sign,charm " +
								"from " +
								"user " +
								"order by " +
								"charm DESC " +
								"limit 0,10");
			} else {
				pstm = conn
						.prepareStatement(
								"select " +
								"friend.userId,nick,sign,charm " +
								"from " +
								"( " +
								"	select " +
								"	friendId userId " +
								"	from " +
								"	friend " +
								"	where " +
								"	userId='" + sId + 
								"'	union " +
								"	select " +
								"	userId " +
								"	from " +
								"	friend " +
								"	where " +
								"	userId='" + sId + 
								"' ) friend ," +
								"user " +
								"where " +
								"friend.userId=user.sId " +
								"order by " +
								"charm DESC " +
								"limit 0,10;");
			}
			rs = pstm.executeQuery();
			rs.last();
			int count = rs.getRow();
			rs.first();
			Charm.setLength(count);
			String[] list = new String[count];
			String[] nick = new String[count];
			String[] sign = new String[count];
			int[] charm = new int[count];
			int i = 0;
			while (rs.next()) {
				list[i] = rs.getString(1);
				nick[i] = rs.getString(2);
				sign[i] = rs.getString(3);
				charm[i++] = Integer.valueOf(rs.getString(4));
			}

			Charm.setUserId(sId);
			Charm.setList(list);
			Charm.setNick(nick);
			Charm.setSign(sign);
			Charm.setCharm(charm);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeAll(conn, pstm, rs);
		}
		return Charm;
	}

	@Override
	public Chat SearchChat(String sId) {
		Chat Chat = new Chat();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			pstm = conn
					.prepareStatement("select " +
							"sId,nick,content,sTime " +
							"from " +
							"( " +
							"	select " +
							"	friendId,content,sTime " +
							"	from " +
							"	message_friend, " +
							"	( " +
							"		select " +
							"		friendId " +
							"		from " +
							"		friend " +
							"		where userId = '" + sId + "' and flag = true " +
							"	) f1 " +
							"	where " +
							"	sender = f1.friendId and geter = '" + sId + "' or sender = '" + sId + "' and geter = f1.friendId " +
							"	order by " +
							"	sTime DESC " +
							"	limit 0,1" +
							") c1, " +
							"user " +
							"where " +
							"user.sId=c1.friendId ");
			rs = pstm.executeQuery();
			rs.last();
			int count = rs.getRow();
			rs.first();
			Chat.setLength(count);
			String[] list = new String[count];
			String[] nick = new String[count];
			String[] Lmessage = new String[count];
			String[] LsTime = new String[count];
			int i = 0;
			while (rs.next()) {
				list[i] = rs.getString(1);
				nick[i] = rs.getString(2);
				Lmessage[i] = rs.getString(3);
				LsTime[i++] = rs.getString(4);
			}

			Chat.setList(list);
			Chat.setUserId(sId);
			Chat.setNick(nick);
			Chat.setLmessage(Lmessage);
			Chat.setLsTime(LsTime);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeAll(conn, pstm, rs);
		}
		return Chat;
	}

	@Override
	public Comment SearchComment(String sId, int trendsId) {
		Comment Comment = new Comment();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			pstm = conn
					.prepareStatement(
							"select " +
							"userId,nick,content,agreeNum " +
							"from " +
							"( " +
							"	select " +
							"	userId,content,agreeNum " +
							"	from " +
							"	comment " +
							"	where " +
							"	trendsId = '" + trendsId + "' " +
							") b1, " +
							"user " +
							"where " +
							"sId=b1.userId ");
			rs = pstm.executeQuery();
			rs.last();
			int count = rs.getRow();
			rs.first();
			Comment.setLength(count);
			String[] list = new String[count];
			String[] nick = new String[count];
			String[] content = new String[count];
			int[] agreeNum = new int[count];
			int i = 0;
			while (rs.next()) {
				list[i] = rs.getString(1);
				nick[i] = rs.getString(2);
				content[i] = rs.getString(3);
				agreeNum[i++] = Integer.valueOf(rs.getString(4));
			}

			Comment.setList(list);
			Comment.setUserId(sId);
			Comment.setNick(nick);
			Comment.setContent(content);
			Comment.setAgreeNum(agreeNum);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeAll(conn, pstm, rs);
		}
		return Comment;
	}

	@Override
	public Friend SearchFriend(String sId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room SearchRoom(String sId, int flag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trends SearchTrends(String sId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ChangeUaInf(UAInf uaInf) {
		// TODO Auto-generated method stub
		return 0;
	}

}
