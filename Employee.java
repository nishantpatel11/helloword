package org.capg.training;

public class Employee {
	long empId;
	String empName;
	String empAddress;
	long empPhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;

	public Employee(long id, String name, String address, long phone) {
		empId = id;
		empName = name;
		empAddress = address;
		empPhone = phone;
	}

	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		System.out.println("Salary of employee is :" + salary);
	}

	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 0.1 * basicSalary;
		System.out.println("Transport allowance is :" + transportAllowance);
	}
}
