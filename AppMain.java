package ru.geekbrains.lesson1;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args)
    {
        System.out.println(task3(2,4,6,2));
        System.out.println(task4(2,3));
        task5(3);
        System.out.println(task6(-3));
        task7("Петушок");
        task8(2020);
    }

    public static float task3(float a, float b, float c, float d)
    {
        return a * (b + (c / d) );
    }

    public static boolean task4(int a, int b)
    {
        if(10 < a + b && a + b > 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void task5(int a)
    {
        if(a <= 0)
        {
            System.out.println("Число в отрицалово пошло, фарту масти");
        }
        else
        {
            System.out.println("Число положительное");
        }
    }

    public static boolean task6(int a)
    {
        if(a <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void task7(String str)
    {
        System.out.println("Привет, " + str + "!");
    }

    public static void task8(int year)
    {
        /*Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();*/

        if( ( ( (year % 4) == 0 ) && ( (year % 100) != 0 ) ) || ((year % 400) == 0) )
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
}
