package application;

import series.ArithmeticProgression;

public class ProgramAP 
{

	public static void main(String[] args) 
	{
		ArithmeticProgression ap1 = new ArithmeticProgression(2, 3);

		for (int i = 1; i < 5; i++) {
			System.out.println(ap1.nextTerm());
		}
	}

}
