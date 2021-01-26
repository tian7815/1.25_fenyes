package com.company.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//处理业务逻辑
		//有关前端所有信息全部封装在request对象里
		/*
		String ip = request.getRemoteAddr();
		int port = request.getRemotePort();
		System.out.println("ip: " + ip + " port: " + port);
		//
		String useAgent = request.getHeader("User-Agent");
		if(useAgent.toLowerCase().contains("chrome")){
			System.out.println("chrome");
		}else if(useAgent.toLowerCase().contains("firefox")){
			System.out.println("firefox");
		}else if(useAgent.toLowerCase().contains("msie")){
			System.out.println("ie");
		}else{
			System.out.println("杂牌浏览器");
		}
		*/
		//后台：分发器
		request.getRequestDispatcher("UpdateServlet").forward(request, response);
		//重定向:浏览器
		//response.sendRedirect("WEB-INF/jsp/MyJsp.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("post....");
	}

}
