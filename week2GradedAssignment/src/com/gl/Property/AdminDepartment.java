package com.gl.Property;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	public String getWorkDeadLine() {
		return "Complete by EOD";
	}
}
