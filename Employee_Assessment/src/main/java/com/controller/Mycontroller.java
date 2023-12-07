package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bean.Employee;
import com.dao.EmployeeDao;


@WebServlet("/Mycontroller")
public class Mycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	if(action.equalsIgnoreCase("insert"))
	{
		Employee e=new Employee();
		e.setFname(request.getParameter("fname"));
		e.setLname(request.getParameter("lname"));
		e.setEmail(request.getParameter("email"));
		e.setMobile(request.getParameter("mobile"));
		e.setAddress(request.getParameter("address"));
		e.setGender(request.getParameter("gender"));
		e.setPassword(request.getParameter("password"));
		EmployeeDao.InsertEmployee(e);
		request.setAttribute("msg","Data Inserted Successfully");
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	}
	else if(action.equalsIgnoreCase("edit"))
	{
		int eid=Integer.parseInt(request.getParameter("eid"));
		Employee e=EmployeeDao.getEmployee(eid);
		request.setAttribute("e", e);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}
	
	else if (action.equalsIgnoreCase("update"))
	{
		Employee e=new Employee();
		e.setEid(Integer.parseInt(request.getParameter("eid")));
		e.setFname(request.getParameter("fname"));
		e.setLname(request.getParameter("lname"));
		e.setEmail(request.getParameter("email"));
		e.setMobile(request.getParameter("mobile"));
		e.setAddress(request.getParameter("address"));
		e.setGender(request.getParameter("gender"));
		e.setPassword(request.getParameter("password"));
		EmployeeDao.updateEmployee(e);
		request.setAttribute("msg","Data Updated Successfully");
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
		
	}
	
	else if (action.equalsIgnoreCase("delete"))
	{
		int eid=Integer.parseInt(request.getParameter("eid"));
		EmployeeDao.deleteEmployee(eid);
		request.setAttribute("msg","Data Updated Successfully");
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}
	
	}

}
