package application;

import java.util.Locale;

import entities.Circle;
import entities.Rectangle;

public class Program 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		Circle c1 = new Circle(1, 2, 5.8);
		Rectangle r1 = new Rectangle(4, 2, 4.6, 2.8);
		
		System.out.println("Circle Data: ");
		System.out.println("Coordinates: (" + c1.getValueX() + " ," + c1.getValueY() + ")" );
		System.out.printf("Perimeter: %.2f%n", c1.perimeter());
		System.out.printf("Area: %.2f%n", c1.area());
		
		System.out.println("---------------");
		
		System.out.println("Rectangle Data: ");
		System.out.println("Coordinates: (" + r1.getValueX() + " ," + r1.getValueY() + ")" );
		System.out.printf("Perimeter: %.2f%n", r1.perimeter());
		System.out.printf("Area: %.2f%n", c1.area());
	}
}
