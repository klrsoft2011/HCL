package com.hcl.emp.util;

import java.util.List;
import java.util.stream.Collectors;

import com.hcl.emp.model.Employee;

public class Util {
	public static List<Employee> Sort(List<Employee> list, String[] sortingAttributes) {
		List<Employee> sortedList = list;

		for (String filed : sortingAttributes) {
			if (null != filed && !filed.isEmpty())
				if (filed.equals("firstName"))
					sortedList = sortedByFirstName(list);
				else if (filed.equals("lastName"))
					sortedList = sortedByLastName(sortedList);
				else if (filed.equals("age"))
					sortedList = sortedByAge(sortedList);
				else if (filed.equals("country"))
					sortedList = sortedByCountry(sortedList);
		}

		return sortedList;
	}

	private static List<com.hcl.emp.model.Employee> sortedByCountry(List<com.hcl.emp.model.Employee> sortedByCountry) {

		return sortedByCountry.stream().sorted((e1, e2) -> e1.getLastName().compareToIgnoreCase(e2.getLastName()))
				.collect(Collectors.toList());
	}

	private static List<com.hcl.emp.model.Employee> sortedByAge(List<com.hcl.emp.model.Employee> sortedByAge) {
		return sortedByAge.stream().sorted((e1, e2) -> e1.getAge().compareTo(e2.getAge())).collect(Collectors.toList());
	}

	private static List<com.hcl.emp.model.Employee> sortedByLastName(List<com.hcl.emp.model.Employee> sortedByName) {

		return sortedByName.stream().sorted((e1, e2) -> e1.getLastName().compareToIgnoreCase(e2.getLastName()))
				.collect(Collectors.toList());
	}

	private static List<com.hcl.emp.model.Employee> sortedByFirstName(List<com.hcl.emp.model.Employee> list) {
		return list.stream().sorted((e1, e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName()))
				.collect(Collectors.toList());

	}

}
