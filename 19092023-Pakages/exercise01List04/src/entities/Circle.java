package entities;

public class Circle 
{
	private int valueX;
	private int valueY;
	private double radius;
	private final double pi;
	
	public Circle(int valueX, int valueY, double radius)
	{
		this.setValueX(valueX);
		this.setValueY(valueY);
		if (radius > 0)
		{
			this.radius = radius;
		}
		else
		{
			this.radius = 1;
		}	
		this.pi = 3.14;
	}
	
	public double perimeter()
	{
		double calc = 2 * pi * radius;
		return calc;
	}
	
	public double area()
	{
		double calc = pi * Math.pow(radius, 2);
		return calc;
	}

	public int getValueX() {
		return valueX;
	}

	public void setValueX(int valueX) {
		this.valueX = valueX;
	}

	public int getValueY() {
		return valueY;
	}

	public void setValueY(int valueY) {
		this.valueY = valueY;
	}
}
