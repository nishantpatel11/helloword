package org.capg.training;

public class CmdLineSorted {
	public static void main(String[] args) 
	{
		int temp;
		int[] a = new int[args.length];
		for (int i=0; i < args.length; i++) 
		{
		    a[i] = Integer.parseInt(args[i]);   
		}
		for (int i = 0; i < args.length; i++) 
        {
            for (int j = i + 1; j < args.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < args.length - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[args.length - 1]);
	}

}
