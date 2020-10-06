package com.hcl.emp.test;

import java.util.ArrayList;
import java.util.List;

import com.hcl.emp.model.Employee;
import com.hcl.emp.util.Util;

public class Test_03 {

	static final int Employee = 0;

	public static void main(String[] args) {

		String[] sortingAttributes = { "firstName", "lastName", "age", "country" };

		Employee e1 = new Employee("ArunKumar", " Rajasekaran", 40, "india");
		Employee e2 = new Employee("Aparna", " Bajpai", 25, "india");
		Employee e3 = new Employee("Nagalakshmi", " Penugonda", 27, "india");
		Employee e4 = new Employee("Amit", " Singh", 28, "German");
		Employee e5 = new Employee("Appasaheb", " Neelawani", 37, "india");
		Employee e6 = new Employee("LakshmiReddy", " Kandukuru", 35, "UK");
		Employee e7 = new Employee("Sowjanya", " gaja", 31, "Europe");
		Employee e8 = new Employee("pratapreddy", " kolli", 50, "Europe");
		Employee e9 = new Employee("Venkatesh", " kandukuru", 32, "UK");
		Employee e10 = new Employee("Thiru", " Rajasekaran", 36, "Canada");
		Employee e11 = new Employee("venu", " kandukuru", 5, "Canada");
		Employee e12 = new Employee("Keerthana", " kolli", 12, "German");
		Employee e13 = new Employee("Nagarjuna", " Chinna", 29, "Japan");
		Employee e14 = new Employee("Vishnu", " Kolli", 23, "Japan");
		Employee e15 = new Employee("Kishore", " Gaja", 40, "Amerika");

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		empList.add(e10);
		empList.add(e11);
		empList.add(e12);
		empList.add(e13);
		empList.add(e14);
		empList.add(e15);

		List<Employee> sortedList = Util.Sort(empList, sortingAttributes);

		for (Employee employee : sortedList) {
			System.out.println(employee);
		}

	}

}
