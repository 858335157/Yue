package com.wyj.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.operate.UserOpt;
import com.wyj.operate.imp.UserOptImp;
import com.wyj.po.list.Charm;
import com.wyj.tools.DA;

public class SearchCharmList extends HttpServlet {

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
		String flag = request.getParameter("flag");

		System.out.print(sId + "试图获取魅力榜\t");
		DA da = new DA();
		if (sId != null && flag != null) {
			UserOpt userOpt = new UserOptImp();
			Charm charm = userOpt.SearchCharm(sId, Integer.valueOf(flag));

			if (charm != null) {
				da.put("state", "0");
				da.put("charm", charm.toString());
				System.out.println(sId + "获取魅力榜成功");
			} else {
				da.put("state", "1");
				System.out.println(sId + "获取魅力榜失败");
			}
		} else {
			da.put("state", "2");
			System.out.println(sId + "获取魅力榜失败");
		}
		out.println(da.toString());
		out.flush();
		out.close();
	}

	public static void main(String[] args) {
	}

}
