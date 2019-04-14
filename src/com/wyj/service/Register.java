package com.wyj.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.operate.UserOpt;
import com.wyj.operate.imp.UserOptImp;
import com.wyj.po.user.UAInf;
import com.wyj.tools.DA;

public class Register extends HttpServlet {

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
		String str = request.getParameter("user");


		UAInf user = new UAInf(str, 0);
		System.out.print(user.getSId()+"试图注册\t");
		UserOpt userOpt = new UserOptImp();
		DA da = new DA();
		if (userOpt.SearchLessInf(user.getSId()) == null) {
			int flag = userOpt.Register(user);
			if (flag == 0) {
				da.put("state", "0");
				System.out.println(user.getSId()+"注册成功");
			} else {
				da.put("state", "1");
				System.out.println(user.getSId()+"注册失败");
			}
		} else {
			da.put("state", "2");
			System.out.println(user.getSId()+"注册失败");
		}
		out.println(da.toString());
		out.flush();
		out.close();
	}

	public static void main(String[] args) {
	}

}
