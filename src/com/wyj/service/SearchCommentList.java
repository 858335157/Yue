package com.wyj.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.operate.UserOpt;
import com.wyj.operate.imp.UserOptImp;
import com.wyj.po.list.Comment;
import com.wyj.tools.DA;

public class SearchCommentList extends HttpServlet {

	/**
	 * 安卓约咖服务器端
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String sId = request.getParameter("sId");
		Integer trendsId = Integer.valueOf(request.getParameter("trendsId"));

		System.out.print(sId + "试图获取动态评论列表\t");
		DA da = new DA();
		if (sId != null && trendsId != null) {
			UserOpt userOpt = new UserOptImp();
			Comment comment = userOpt.SearchComment(sId,trendsId);

			if (comment != null) {
				da.put("state", "0");
				da.put("chat", comment.toString());
				System.out.println(sId + "获取动态评论列表成功");
			} else {
				da.put("state", "1");
				System.out.println(sId + "获取动态评论列表失败");
			}
		} else {
			da.put("state", "2");
			System.out.println(sId + "获取动态评论列表失败");
		}
		out.println(da.toString());
		out.flush();
		out.close();
	}

	public static void main(String[] args) {
	}

}
