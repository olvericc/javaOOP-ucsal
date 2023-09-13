package application;

import entities.Students;

public class Program
{

    public static void main(String[] args)
    {

        Students student1 = new Students("1", "Eric", 10.0, 8.4, 9.2);
        Students student2 = new Students("2", "Felipe", 9.8, 3.0, 9.0);
        Students student3 = new Students("3", "Guilherme", 5.0, 3.2, 8.6);

        Students[] students = { student1, student2, student3 };

        System.out.println("+-----------------------------------------------------------------------------------------------------+");
        System.out.println("| Student 1: " + student1 + "     |");
        System.out.println("| Student 2: " + student2 + "    |");
        System.out.println("| Student 3: " + student3 + " |");
        System.out.println("+-----------------------------------------------------------------------------------------------------+");

        for (Students student : students)
        {
            if (student.needsFinalExam())
            {
                System.out.println(student.getName() + " need a grade on the final exam");
            }
        }
    }
}
