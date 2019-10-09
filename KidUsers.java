package org.capg.training;

public class KidUsers implements LibraryUser {
	
	@Override
	public void registerAccount(int age) {
		if(age<12)
		{
			System.out.println("You have successfully registered under kids Account");
		}
		if(age>12)
		{
			System.err.println("Sorry,Age must be less than 12 to register under kid");
		}
	}

	@Override
	public void requestBook(String bookType) {
	if(bookType=="kids")
	{
		System.out.println("Book Issued Successfully,Please return the book in 10 days");
	}
	else
	{
		System.err.println("Oops,You are allowed to take only kids books");
	}
	}

}
