package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.Dao.UsersDao;
import com.company.DaoImpl.UsersDaoIpml;
import com.company.entiy.Users;

public class UsersServlet extends HttpServlet {


	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sid = request.getParameter("sid");
		Users user = new Users();
		user.setSid(sid);
		UsersDao ud = new UsersDaoIpml();
		try {
			String d = ud.delete(user);
			System.out.println(d);
			if (d!=null) {
				request.getRequestDispatcher("Users.jsp").forward(request, response);
			}else{
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
