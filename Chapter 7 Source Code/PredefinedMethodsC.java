//How to use the predefined methods

import static java.lang.Math.*;
import static java.lang.Character.*;

public class PredefinedMethodsC
{
    public static void main(String[] args)
    {
        int   i;

	    System.out.printf("%5s %6s %6s %6s \n", "i", "sin", "cos", "tan");

	    for (i = 0; i <= 180; i = i + 30)
	    {
	        System.out.printf("%5d %6.2f %6.2f %6.2f\n",
	                           i, sin(i), cos(i), tan(i));
	        if (i == 30)
	            System.out.printf("%5d %6.2f %6.2f %6.2f\n",
	                              i, sin(45), cos(45), tan(45));
	    }

	    System.out.printf("%5s %6.2f %6.2f %6.2f\n",
	                      "PI/6",  sin(PI / 6), cos(PI / 6), tan(PI / 6));

	    System.out.printf("%5s %6.2f %6.2f %6.2f\n",
	                      "PI/4",  sin(PI / 4), cos(PI / 4), tan(PI / 4));

        System.out.printf("%5s %6.2f %6.2f %6.2f\n",
			              "PI/3",  sin(PI / 3), cos(PI / 3), tan(PI / 3));

        System.out.printf("%5s %6.2f %6.2f %6.2f\n",
			              "PI/2",  sin(PI / 2), cos(PI / 2), tan(PI / 2));

        System.out.printf("%5s %6.2f %6.2f %6.2f\n",
			              "2PI/3",  sin(2 * PI / 3), cos(2 * PI / 3), tan(2 * PI / 3));

   	    System.out.println();

        System.out.println("To sixteen decimal places: ");
   	    System.out.println("cos(PI / 2) = " + cos(PI / 2));
   	    System.out.println("cos(PI / 3) = " + cos(PI / 3));
   	    System.out.println("cos(PI / 4) = " + cos(PI / 4));
   	    System.out.println("cos(PI / 6) = " + cos(PI / 6));
    }
}

