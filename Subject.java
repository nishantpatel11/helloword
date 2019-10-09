package org.capg.training;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter sub1 marks");
		int sub1=scanner.nextInt();
		System.out.println("Enter sub2 marks");
		int sub2=scanner.nextInt();
		System.out.println("Enter sub3 marks");
		int sub3=scanner.nextInt();
		
      if(sub1>60 && sub2>60 && sub3>60)
      {
    	  System.out.println("passed");
      }
      else if(sub1>60 && sub2>60 ||sub2>60 && sub3>60 ||sub3>60&& sub1>60)
      {
    	  System.out.println("promoted");
      }
	
      else if(sub1>60 && sub2<60 &&sub3<60 ||sub2>60 && sub3<60 &&sub1<60 ||sub3>60 && sub1<60 &&sub2<60)
	{
		System.out.println("fail");
	
	}
      else
      {
    	  System.out.println("fail");
      }
  	scanner.close();
	}

}
