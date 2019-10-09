package org.capg.training;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kidUsers = new KidUsers();
		kidUsers.registerAccount(10);
		kidUsers.requestBook("kids");
		kidUsers.registerAccount(18);
		kidUsers.requestBook("fiction");
		AdultUsers adultUsers = new AdultUsers();
		adultUsers.registerAccount(5);
		adultUsers.requestBook("kids");
		adultUsers.registerAccount(23);
		adultUsers.requestBook("fiction");

	}

}
