package application;

import entities.Lights;

public class Program
{

    public static void main(String[] args)
    {
        Lights[] stripOfLights = new Lights[5];

        lightsOn(stripOfLights);

        for (int i = 1; i < 10; i++)
        {
            showLights(stripOfLights);
            changeLights(stripOfLights);
        }
    }

    public static void lightsOn(Lights[] li)
    {
        for (int i = 0; i < li.length; i++)
        {
            li[i] = new Lights();

            if (i % 2 == 0)
            {
                li[i].onOrOff();
            }
        }
    }

    public static void showLights(Lights[] li)
    {
        System.out.println("-");

        for (Lights lights : li) {
            if (lights.getStatus()) {
                System.out.print("*-");
            } else {
                System.out.print("o-");
            }
        }
        System.out.println();
    }

    public static void changeLights(Lights[] li)
    {
        for (int i = 0; i < li.length; i++)
        {
            li[i].onOrOff();
        }
    }
}
