package entities;

public class Students
{

    private final String enrollment;
    private final String name;
    private final double firstExam;
    private final double secondExam;
    private final double workGrade;

    public Students(String enrollment, String name, double firstExam, double secondExam, double workGrade)
    {
        this.enrollment = enrollment;
        this.name = name;

        if (firstExam >= 0 && secondExam >= 0 && workGrade >= 0)
        {
            this.firstExam = firstExam;
            this.secondExam = secondExam;
            this.workGrade = workGrade;
        }
        else
        {
            this.firstExam = 0;
            this.secondExam = 0;
            this.workGrade = 0;
        }
    }

    public double averageGrade()
    {
        return ((firstExam * 2.5 + secondExam * 2.5 + workGrade * 2.0) / 7.0);
    }

    public double finalAverageGrade()
    {
        double averageGrade = averageGrade();
        if (averageGrade() < 7.0)
        {
            return Math.max(0.0, 10.0 - averageGrade);
        }
        else
        {
            return 0.0;
        }
    }

    public boolean needsFinalExam()
    {
        return finalAverageGrade() > 0;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return  "enrollment = '" + enrollment + '\'' +
                ", name = '" + name + '\'' +
                ", firstExam = " + firstExam +
                ", secondExam = " + secondExam +
                ", workGrade = " + workGrade;
    }
}
