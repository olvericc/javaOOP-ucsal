package entities;

public class ArithmeticProgression
{
    int firstTerm = 2;
    int reason = 2;
    int currentTerm = this.firstTerm;

    public int nextTerm()
    {
        int current = this.currentTerm;
        this.currentTerm += this.reason;
        return current;
    }
}
