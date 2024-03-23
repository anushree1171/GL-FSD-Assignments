package com.gl.Driver;
import com.gl.Property.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		//Admin department
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadLine());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		
		//HR department
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		
		//Tech Department
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.doActivity());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
		
		
	}

}
