package application;

import series.Fibonacci;

public class ProgramF 
{

	public static void main(String[] args) 
	{
		
		Fibonacci f1 = new Fibonacci();
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(f1.nextTerm());
		}

	}

}
