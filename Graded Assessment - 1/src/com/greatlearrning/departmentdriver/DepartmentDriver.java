package com.greatlearrning.departmentdriver;

import com.greatlearning.department.*;

import java.util.Scanner;

public class DepartmentDriver {

	public static void main(String[] args) {
		System.out.println("Please choose the Department Name from the following: ");
		System.out.println(" 1. Admin Department \n 2. HR Department \n 3.Tech Department ");
		Scanner sc = new Scanner(System.in);

		int option = sc.nextInt();
		switch (option) {
		case 1:
			AdminDepartment obj1 = new AdminDepartment();

			System.out.println(obj1.departmentName());
			System.out.println(obj1.getTodaysWork());
			System.out.println(obj1.getWorkDeadline());
			System.out.println(obj1.isTodayAHoliday());
			System.out.println();
			System.out.println();
			break;
		case 2:
			HRDepartment obj2 = new HRDepartment();
			System.out.println(obj2.departmentName());
			System.out.println(obj2.doAcitivity());
			System.out.println(obj2.getTodaysWork());
			System.out.println(obj2.getWorkDeadline());
			System.out.println(obj2.isTodayAHoliday());
			break;
		case 3:
			TechDepartment obj3 = new TechDepartment();
			System.out.println(obj3.departmentName());
			System.out.println(obj3.getTodaysWork());
			System.out.println(obj3.getWorkDeadline());
			System.out.println(obj3.getTechStackInformation());
			System.out.println(obj3.isTodayAHoliday());
			break;
		}
	}

}
