package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.util.EmployeeUtil;

public class EmployeeDao {

		public static void InsertEmployee(Employee e)
		{
			try {
				Connection conn=EmployeeUtil.creatCnnection();
				String sql="insert into employee(fname,lname,email,mobile,address,gender,password) values(?,?,?,?,?,?,?)";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1,e.getFname());
				pst.setString(2,e.getLname());
				pst.setString(3,e.getEmail());
				pst.setString(4,e.getMobile());
				pst.setString(5,e.getAddress());
				pst.setString(6,e.getGender());
				pst.setString(7,e.getPassword());
				pst.executeUpdate();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		public static void updateEmployee(Employee e)
		{
			try {
				Connection conn=EmployeeUtil.creatCnnection();
				String sql="update employee set fname=?,lname=?,email=?,mobile=?,address=?,gender=?,password=? where eid=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1,e.getFname());
				pst.setString(2,e.getLname());
				pst.setString(3,e.getEmail());
				pst.setString(4,e.getMobile());
				pst.setString(5,e.getAddress());
				pst.setString(6,e.getGender());
				pst.setString(7,e.getPassword());
				pst.setInt(8,e.getEid());
				pst.executeUpdate();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		public static void deleteEmployee(int eid)
		{
			try {
				Connection conn=EmployeeUtil.creatCnnection();
				String sql="delete from employee where eid=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				
				pst.setInt(1,eid);
				pst.executeUpdate();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
		public static List<Employee> getAllEmployee()
		{
			List<Employee> list =new ArrayList<Employee>();
			
			try {
				Connection conn=EmployeeUtil.creatCnnection();
				String sql="select * from employee";
				PreparedStatement pst=conn.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();
				while (rs.next()) 
				{
					Employee e=new Employee();
					e.setEid(rs.getInt("eid"));
					e.setFname(rs.getString("fname"));
					e.setLname(rs.getString("lname"));
					e.setEmail(rs.getString("email"));
					e.setMobile(rs.getString("mobile"));
					list.add(e);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
		public static Employee getEmployee(int eid)
		{
			Employee e=null;
			
			try {
				Connection conn=EmployeeUtil.creatCnnection();
				String sql="select * from employee where eid=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1,eid);
				ResultSet rs=pst.executeQuery();
				while (rs.next()) 
				{
					e=new Employee();
					e.setEid(rs.getInt("eid"));
					e.setFname(rs.getString("fname"));
					e.setLname(rs.getString("lname"));
					e.setEmail(rs.getString("email"));
					e.setMobile(rs.getString("mobile"));
					e.setGender(rs.getString("gender"));
					e.setAddress(rs.getString("address"));
					e.setPassword(rs.getString("password"));
					
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return e;
		}
}
