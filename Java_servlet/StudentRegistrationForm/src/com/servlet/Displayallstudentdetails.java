package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Displayallstudentdetails
 */import com.constants.*;
 public class Displayallstudentdetails extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	 /**
	  * @see HttpServlet#HttpServlet()
	  */
	 public Displayallstudentdetails() {
		 super();
		 // TODO Auto-generated constructor stub
	 }

	 /**
	  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	  */
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // TODO Auto-generated method stub
		 //response.getWriter().append("Served at: ").append(request.getContextPath());
		 RetriveStudentdetails r=new RetriveStudentdetails();
		 List<StudentDetails> d=r.getdetails();
		 request.setAttribute(Constant.displayall, d);
		 request.getRequestDispatcher("display.jsp").forward(request,response);
	 }

	 /**
	  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	  */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // TODO Auto-generated method stub
		 doGet(request, response);
	 }

 }
