package entities;

public class ArithmeticProgression
{

    private int firstTerm;
    private int reason;
    private int currentTerm;

    public ArithmeticProgression(int firstTerm, int reason)
    {
        this.firstTerm = firstTerm;
        this.reason = reason;
        this.currentTerm = firstTerm;
    }

    public int nextTerm()
    {
        int current = this.currentTerm;
        this.currentTerm += reason;
        return current;
    }

    public void setFirstTerm(int firstTerm)
    {
        this.firstTerm = firstTerm;
        this.currentTerm = this.firstTerm;
    }

    public void setReason(int reason)
    {
        this.reason = reason;
        this.currentTerm = this.firstTerm;
    }

}