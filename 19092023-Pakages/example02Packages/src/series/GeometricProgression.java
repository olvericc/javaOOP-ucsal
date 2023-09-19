package series;

public class GeometricProgression 
{
	private int firstTerm;
	private int reason;
	private int currentTerm;
	
	public GeometricProgression(int firstTerm, int reason)
	{
		this.firstTerm = firstTerm;
		this.reason = reason;
		this.currentTerm = this.firstTerm;
	}
	
	public int nextTerm()
	{
		int current = this.currentTerm;
		this.currentTerm *= reason;
		return current;
	}
	
	
}
