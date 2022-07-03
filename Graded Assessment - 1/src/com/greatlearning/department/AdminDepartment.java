package com.greatlearning.department;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String a = "Welcome to Admin Department";
		return a;
	}

	public String getTodaysWork() {
		String b = "Complete your documents submission";
		return b;
	}

	public String getWorkDeadline() {
		String c = "Complete by EOD";
		return c;
	}

}
