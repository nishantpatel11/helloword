package org.capg.training;

public class AdultUsers implements LibraryUser {
	int age;
	String bookType;

	@Override
	public void registerAccount(int age) {
		if (age > 12) {
			System.out.println("You have successfully registered under Adults Account");
		}
		if (age < 12) {
			System.err.println("Sorry,Age must be greater than 12 to register under Adults");
		}

	}

	@Override
	public void requestBook(String bookType) {
		if (bookType == "fiction") {
			System.out.println("Book Issued Successfully,Please return the book in 7 days");
		} else {
			System.err.println("Oops,You are allowed to take only adult fiction books");
		}
	}

}
