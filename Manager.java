package org.capg.training;

public class Manager extends Employee {

	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}

	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 15 * basicSalary/100;
		System.out.println("Transport allowance is " + transportAllowance);
	}

}
