//Program: Print a triangle of stars

import java.util.*;

public class TriangleOfStars
{
    static Scanner console = new Scanner(System.in);

    public static void main (String[] args)
    {
        int numberOfLines;
        int counter;
        int numberOfBlanks;

        System.out.print("Enter the number of star lines "
                       + "(1 to 20) to be printed: ");   //Line 1
        numberOfLines = console.nextInt();               //Line 2
        System.out.println();                            //Line 3

        while (numberOfLines < 0 || numberOfLines > 20)  //Line 4
        {
            System.out.println("The number of star "
                             + "lines should be between "
                             + "1 and 20");              //Line 5
            System.out.print("Enter the number of star "
                           + "lines (1 to 20) to be "
                           + "printed: ");               //Line 6
            numberOfLines = console.nextInt();           //Line 7
            System.out.println ();                       //Line 8
        }

        numberOfBlanks = 30;                             //Line 9

        for (counter = 1; counter <= numberOfLines;
                          counter++)                     //Line 10
        {
            printStars(numberOfBlanks, counter);         //Line 11
            numberOfBlanks--;                            //Line 12
        }
    }

    public static void printStars(int blanks, int starsInLine)
    {
        int count;

        for (count = 1; count <= blanks; count++)        //Line 13
            System.out.print(" ");                       //Line 14

        for (count = 1; count <= starsInLine; count++)   //Line 15
            System.out.print(" *");                      //Line 16

        System.out.println();                            //Line 17
    }
}