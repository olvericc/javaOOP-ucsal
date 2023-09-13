package entities;

public class Triangle
{
    private final double sideOne;
    private final double sideTwo;
    private final double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree)
    {
        if (isTriangle(sideOne, sideTwo, sideThree))
        {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        }
        else
        {
            this.sideOne = 2.0;
            this.sideTwo = 2.0;
            this.sideThree = 2.0;
        }
    }

    public boolean isTriangle(double sideOne, double sideTwo, double sideThree)
    {
        return ((sideOne < sideTwo + sideThree) && (sideTwo < sideOne + sideThree) && (sideThree < sideOne + sideTwo));
    }

    public double perimeter()
    {
        return (this.sideOne + this.sideTwo + this.sideThree);
    }

    @Override
    public String toString() {
        return  "sideOne = " + sideOne + ", sideTwo = " + sideTwo + ", sideThree = " + sideThree;
    }
}
