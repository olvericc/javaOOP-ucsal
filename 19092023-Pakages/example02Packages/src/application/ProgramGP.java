package application;

import series.GeometricProgression;

public class ProgramGP 
{
	public static void main(String[] args) 
	{
		GeometricProgression gp1 = new GeometricProgression(1, 2);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(gp1.nextTerm());
		}
	}
}
