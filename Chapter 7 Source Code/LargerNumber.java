//Program: Largest of three numbers

import java.util.*;

public class LargerNumber
{
  static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double num1;                                   //Line 1
        double num2;                                   //Line 2

        System.out.println("Line 3: The larger of "
                         + "5.6 and 10.8 is "
                         + larger(5.6, 10.8));         //Line 3

        System.out.print("Line 4: Enter two "
                       + "numbers: ");                 //Line 4
        num1 = console.nextDouble();                   //Line 5
        num2 = console.nextDouble();                   //Line 6
        System.out.println();                          //Line 7

        System.out.println("Line 8: The larger of "
                      + num1 + " and " + num2 + " is "
                      + larger(num1, num2));           //Line 8

        System.out.println("Line 9: The largest of 23.5, "
                     + "34.6, and 12 is "
                     + compareThree(23.5, 34.6, 12));  //Line 9
    }

    public static double larger(double x, double y)
    {
        if (x >= y)
            return x;
        else
            return y;
    }

    public static double compareThree(double x, double y,
                                      double z)
    {
        return larger(x, larger(y, z));
    }
}

