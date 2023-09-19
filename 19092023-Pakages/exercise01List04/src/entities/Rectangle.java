package entities;

public class Rectangle 
{
	private int valueX;
	private int valueY;
	private double width;
	private double height;
	
	public Rectangle(int valueX, int valueY, double width, double height)
	{
		this.setValueX(valueX);
		this.setValueY(valueY);
		if (height > 0)
		{
			this.height = height;
		}
		else
		{
			this.height = 1;
		}
		if (width > 0)
		{
			this.width = width;
		}
		else
		{
			this.width = 1;
		}
	}
	
	public double perimeter()
	{
		double calc = (2 * height) + (2 * width);
		return calc;
	}
	
	public double area()
	{
		double calc = width * height;
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
