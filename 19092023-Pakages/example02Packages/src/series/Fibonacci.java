package series;

public class Fibonacci {
	
	private int a = 1;
	private int b = 1;
	private int c = 2;
	
	public int nextTerm()
	{
	
		int atual = this.a;
		this.a = this.b;
		this.b = this.c;
		this.c = this.a + this.b;
		return atual;
	}
	
}
