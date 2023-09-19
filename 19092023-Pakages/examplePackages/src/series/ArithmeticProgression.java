package series;

public class ArithmeticProgression 
{
	private int firstTerm;
	private int reason;
	private int currentTerm;
	
	public ArithmeticProgression(int firstTerm, int reason)
	{
		this.firstTerm = firstTerm;
		this.reason = reason;
		this.currentTerm = this.firstTerm;
	}
	
	public int nextTerm()
	{
		int current = this.currentTerm;
		this.currentTerm += reason;
		return current;
	}
}
